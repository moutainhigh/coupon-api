package cn.vpclub.coupon.api.thirdparty.macdonald;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;


/**
 * zhangyingdong 2018.2.7
 */
@Data
@Accessors(chain = true)
public class SubmitVerifyReq {
    private String SystemID;//接入系统号
    private String ISSPID;//业务商号
    private String TransactionID;//请求流水号
    private Recipients Recipients;//条码凭证接收号
    private String SendClass;//发送类型
    private Messages Messages;//短信内容，最长不超过100个字
    private pin_setting pin_setting;
    private ActivityInfo ActivityInfo;//活动号
    private char BmpFlag;//是否需要返回图片信息   N
    private String CustomArea;//定制区域    N
    private String serviceUrl;


}
