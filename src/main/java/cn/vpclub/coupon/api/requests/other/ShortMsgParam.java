package cn.vpclub.coupon.api.requests.other;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author:yangqiao
 * @description:
 * @Date:2018/1/18
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class ShortMsgParam {

    private Long userId;

    private Long appId;

    private Long receiveUserId;

    private String userName;

    private String productName;

    private String couponCode;

    private String receiveUserPhone;

    private String msgContent;

    private String subOrderNo;

    private String cardNo;

    private String cardPwd;
    /**
     * 卡券使用有效期终止日期开始日期-str
     */
    private String effectiveDateEndStartStr;
    /**
     * 卡券使用有效期终止日期结束日期-str
     */
    private String effectiveDateEndEndStr;
    /**
     * 平台名称
     */
    private String appName;
}