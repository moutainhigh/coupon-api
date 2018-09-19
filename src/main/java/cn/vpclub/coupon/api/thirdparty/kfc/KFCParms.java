package cn.vpclub.coupon.api.thirdparty.kfc;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author:yangqiao
 * @description:
 * @Date:2017/12/22
 */
@Data
@Accessors(chain = true)
public class KFCParms {

    private String signMsg;//签名字符串
    private String submitTimestamp;//请求时间戳
    private String pid;//商户号
    private String cardBatchNo;//卡券批次号
    private String password;//认证密码
    private String orderId;//换购订单号
    private String customerNo;//客户识别号
    private Long orderQuantity;//换购数量
    private String orderTime;//换购时间
    private Long orderPoints;//换购积分数
    private Long orderPrice;//换购总金额  n
    private String provUser;//用户来自哪个省  n
    private String provUse;//使用目的地省份  n
    private String serviceUrl;//




}