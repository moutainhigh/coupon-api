package cn.vpclub.coupon.api.thirdparty.sohu;

import cn.vpclub.coupon.api.thirdparty.kfc.Security;
import cn.vpclub.moses.utils.web.HttpRequestUtil;
import com.google.gson.Gson;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Set;

public class SohuUtil {
    private static Logger log = LoggerFactory.getLogger(SohuUtil.class);
    //static String http = "http://test.jifenfu.net:59085/orderCard2";// 接口地址

    /**
     * 循环调用order方法直到生成码
     * @param sohuRequest
     */
    public static SohuResponse tryOrder(SohuRequest sohuRequest) throws Exception {
        int count = 0;
        SohuResponse response = order(sohuRequest);
        while (count < 3 && StringUtils.isBlank(response.getExchangeCode())) {
            response = order(sohuRequest);
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
     * @param sohuRequest
     * @return
     */
    private static SohuResponse order(SohuRequest sohuRequest) throws UnsupportedEncodingException {
        // 加密参数生成signMsg,空参数不能参加签名
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        map.put("submitTimestamp", String.valueOf(System.currentTimeMillis()));// 请求时间戳
        map.put("pid", sohuRequest.getPid());//平台分配的商户号
        map.put("cardBatchNo", sohuRequest.getCardBatchNo());//卡券批次编码，事先约定
        map.put("password", sohuRequest.getPassword());//密钥，生成signMsg时使用，URL中不需提交本参数
        map.put("orderId", sohuRequest.getOrderId());//采购商的订单号，保证唯一，如果是之前提交过的订单号，会认为是重新获取卡券，返回之前订单的卡券
        map.put("customerNo", sohuRequest.getCustomerNo());//客户识别号,手机号等
        map.put("orderQuantity", String.valueOf(sohuRequest.getOrderQuantity()));//订购商品数量，由服务器端的cardBatchNo决定是按照数量还是按照金额拆分
        map.put("orderTime", simpleDateFormat.format(System.currentTimeMillis()));// 换购时间,YYYYMMDDHH24MISS
        map.put("orderPoints", String.valueOf(sohuRequest.getOrderPoints()));//扣除采购商的积分或者其他货品数量
        //		map.put("orderPrice", String.valueOf(100));
        // 单位：分，对于能确定金额的请传递金额，将根据金额自动兑换券数量，比如传递12000，为120元，服务器可能会返回50元，50元，20元三张券,
        // 对于采购固定商品的请不要传本参数
        String provUser = "53";//云南省
        map.put("provUser", provUser);//用户来自哪个省，用于统计结算，可以留空，留空的话以用户手机号码判断归属地
        map.put("provUse", provUser);//卡券使用目的省，生成哪  个省的卡券，可以留空，留空认为是购买手机归属地省份的卡券

        String md5 = getSignMd5(map);// 将参数用MD5方式加密
        map.put("signMsg", md5);// 生成signMsg
        map.remove("password");// 请求url中不需传递password参数
        String url = sohuRequest.getServiceUrl() + "!order.do?" + getURL(map);// 生成url
        String resp = HttpRequestUtil.sendJsonGet(url, "");// 获得http请求的反馈
        log.info("order url=>" + url + "\r\n resp=>" + resp);
        return new Gson().fromJson(resp, SohuResponse.class);// 返回json格式的对象



    }
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
