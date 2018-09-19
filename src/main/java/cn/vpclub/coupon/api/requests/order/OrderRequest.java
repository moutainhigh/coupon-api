package cn.vpclub.coupon.api.requests.order;

import cn.vpclub.coupon.api.entity.O2oCoupon;
import cn.vpclub.moses.utils.validator.AbstractGenericParameter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author:yangqiao
 * @description:
 * @Date:2017/12/12
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class OrderRequest extends AbstractGenericParameter {

    /**
     * 应用id
     */
    private Long appId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 卡券来源，0-平台，其他-第三方
     */
    private Integer couponSource;

    /**
     * O2O卡券列表
     */
    private List<O2oCoupon> o2oCouponList;

    /**
     * 第三方发券返回代码
     */
    private Integer thirdReturnCode;

    /**
     * 第三方发券返回描述
     */
    private String thirdReturnCodeDesc;
}