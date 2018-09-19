package cn.vpclub.coupon.api.thirdparty.kfc;

import cn.vpclub.moses.utils.web.HttpRequestUtil;
import com.google.gson.Gson;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Set;

public class KFCWeiNengReqUtil {

    private static Logger log = LoggerFactory.getLogger(KFCWeiNengReqUtil.class);
    //  public static String pid = "wntest";// 平台分配的商户号
    //  public static String password = "135246";// 密钥，生成signMsg时使用，URL中不需提交本参数
    //  public static String http = "http://test.jifenfu.net:59085/orderCard2";// 接口地址

    //	public static String pid = "yncmcc2017";// 平台分配的商户号
    //	public static String password = "6faf11fd9b4bbfa9";// 密钥，生成signMsg时使用，URL中不需提交本参数
    //	public static String cardBatchNo = "201612048735";// 卡券批次编码，事先约定
    //	public static String http = "http://api.jifenfu.net/orderCard2!order.do";// 接口地址

    /**
     * 循环调用order方法直到生成码
     *
     * @param kfcParms
     */
    public static KFCResponse tryOrder(KFCParms kfcParms) throws
            Exception {
        int count = 0;
        KFCResponse response = order(kfcParms);
        while (count < 3 && StringUtils.isBlank(response.getExchangeCode())) {
            response = order(kfcParms);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        log.info("tryOrder count:" + count + " JifenCardOrderInfoResponse:" + response);
        return response;
    }

    /**
     * 构建order方法传递参数与加密
     *
     * @param kfcParms
     * @return
     * @throws Exception
     */
    public static KFCResponse order(KFCParms kfcParms) throws
            Exception {
        // 加密参数生成signMsg,空参数不能参加签名
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        SimpleDateFormat formater = new SimpleDateFormat("yyyyMMddHHmmss");
        map.put("submitTimestamp", formater.format(new Date()));// 请求时间戳
        map.put("pid", kfcParms.getPid());//平台分配的商户号
        map.put("cardBatchNo", kfcParms.getCardBatchNo());//卡券批次编码，事先约定
        map.put("password", kfcParms.getPassword());//密钥，生成signMsg时使用，URL中不需提交本参数
        map.put("orderId", kfcParms.getOrderId());//采购商的订单号，保证唯一，如果是之前提交过的订单号，会认为是重新获取卡券，返回之前订单的卡券
        map.put("customerNo", kfcParms.getCustomerNo());//客户识别号,手机号等
        map.put("orderQuantity", String.valueOf(kfcParms.getOrderQuantity()));//订购商品数量，由服务器端的cardBatchNo决定是按照数量还是按照金额拆分
        map.put("orderTime", formater.format(new Date()));// 换购时间,YYYYMMDDHH24MISS
        map.put("orderPoints", String.valueOf(kfcParms.getOrderQuantity()));//扣除采购商的积分或者其他货品数量
        //		map.put("orderPrice", String.valueOf(100));
        // 单位：分，对于能确定金额的请传递金额，将根据金额自动兑换券数量，比如传递12000，为120元，服务器可能会返回50元，50元，20元三张券,
        // 对于采购固定商品的请不要传本参数
        String provUser = "53";//云南省
        map.put("provUser", provUser);//用户来自哪个省，用于统计结算，可以留空，留空的话以用户手机号码判断归属地
        map.put("provUse", provUser);//卡券使用目的省，生成哪个省的卡券，可以留空，留空认为是购买手机归属地省份的卡券
        //orderQuantity就是单次请求商品的数量，一笔顶单不能超过10个
        //orderPoints可以和orderQuantity传的一样，不影响出码但是必须要传
        //orderPrice可以不传，商品价格在cardBatchNo中已经体现

        String md5 = getSignMd5(map);// 将参数用MD5方式加密
        map.put("signMsg", md5);// 生成signMsg
        map.remove("password");// 请求url中不需传递password参数

        String url = kfcParms.getServiceUrl() + getURL(map);// 生成url

        String resp = HttpRequestUtil.sendJsonGet(url, "");// 获得http请求的反馈
        log.info("order url=>" + url + "\r\n resp=>" + resp);
        return new Gson().fromJson(resp, KFCResponse.class);// 返回json格式的对象
    }
/*

    */

    /**
     * 构建query方法传递参数与加密
     * <p>
     * /@param cardNumber
     *
     * @return
     * @throws Exception
     *//*

    public static JifenCardQueryResponse query(String cardNumber, String orderId) throws Exception {
        // 加密参数生成signMsg
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        SimpleDateFormat formater = new SimpleDateFormat("yyyyMMddHHmmss");
        map.put("submitTimestamp", formater.format(new Date()));// 请求时间戳
        map.put("pid", pid);//平台分配的商户号
        map.put("password", password);//N 注册供应商密钥，生成signMsg时使用，URL中不需提交本参数
        if (orderId != null && !"".equals(orderId.trim())) {
            map.put("orderId", orderId);//N 字符串,查出本订单的所有卡
        }
        if (cardNumber != null && !"".equals(cardNumber.trim())) {
            map.put("cardNumber", cardNumber);//字符串,查出一个卡，多张卡用,号分割
        }

        //说明：查询的订单号orderId或者卡券号码cardNumber二者之间不能同时为空；如果二个都非空，以卡券号码cardNumber的查询结果作为返回值。

        String md5 = getSignMd5(map);// 将参数用MD5方式加密
        map.put("signMsg", md5);// 生成signMsg
        map.remove("password");// 请求url中不需传递password参数

        String url = http + "!queryCard.do?" + getURL(map);// 生成url
        String resp = Common.getRestful(url, "", "GET");// 获得http请求的反馈
        log.info("query url=>" + url + "\r\n resp=>" + resp);
        System.out.println("query url=>" + url + "\r\n resp=>" + resp);// 打印输出请求url与反馈resp
        return new Gson().fromJson(resp, JifenCardQueryResponse.class);// 返回json格式的对象
    }

    //构建cancel方法传递参数与加密
    public static JifenCardCancelResponse cancel(String cardNumber, String orderId) throws Exception {
        // 加密参数生成signMsg
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        map.put("submitTimestamp", "20150603051820");// 请求时间戳
        map.put("pid", pid);//平台分配的商户号
        map.put("password", password);//注册供应商密钥，生成signMsg时使用，URL中不需提交本参数
        if (orderId != null && !"".equals(orderId.trim())) {
            map.put("orderId", orderId);//N 字符串,查出本订单的所有卡
        }
        if (cardNumber != null && !"".equals(cardNumber.trim())) {
            map.put("cardNumber", cardNumber);//字符串,查出一个卡，多张卡用,号分割
        }
        //说明：作废的订单号orderId或者卡券号码cardNumber二者之间不能同时为空；如果二个都非空，以卡券号码cardNumber的查询结果作为作废依据。


        String md5 = getSignMd5(map);// 将参数用MD5方式加密
        map.put("signMsg", md5);// 生成signMsg
        map.remove("password");// 请求url中不需传递password参数

        String url = http + "!orderCancelCard.do?" + getURL(map);// 生成url
        String resp = Common.getRestful(url, "", "GET");// 获得http请求的反馈
        log.info("cancel url=>" + url + "\r\n resp=>" + resp);
    //	System.out.println("cancel url=>" + url + "\r\n resp=>" + resp);// 打印输出请求url与反馈resp
        return new Gson().fromJson(resp, JifenCardCancelResponse.class);// 返回json格式的对象
    }
*/
    public static String getSignMd5(LinkedHashMap<String, String> map) throws UnsupportedEncodingException {
        String url = getURL(map);
        return Security.MD5(url);
    }

    public static String getURL(LinkedHashMap<String, String> map) throws UnsupportedEncodingException {
        String md5 = "";
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            if (key != null)
                md5 += key + "=" + URLEncoder.encode(value, "UTF-8") + "&";
            else
                md5 += key + "=&";

        }
        md5 = md5.substring(0, md5.length() - 1);
        return md5;
    }
}
