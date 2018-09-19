package cn.vpclub.coupon.api.requests.o2ocoupon;

import cn.vpclub.moses.utils.validator.AbstractGenericParameter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author:yangqiao
 * @description:
 * @Date:2018/1/3
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class O2OCouponRequest extends AbstractGenericParameter {

    /**
     * 应用id
     */
    private Long appId;
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 买家id
     */
    private Long buyerId;
    /**
     * 买家手机号码
     */
    private String buyerPhone;
}