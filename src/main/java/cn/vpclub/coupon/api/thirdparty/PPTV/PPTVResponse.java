package cn.vpclub.coupon.api.thirdparty.PPTV;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PPTVResponse {
    private String errorCode;
    private String message;
    private String exchangeCode;//兑换编码

    private String phone;//申领账号
    private String channel;//渠道号
    private String outorderid;//外部订单号
    private String packageid;//卡包id，由pptv提供
    private Integer status;// 状态 0表示退订，1表示订购
    private String sign;//签名
}
