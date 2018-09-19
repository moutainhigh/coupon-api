package cn.vpclub.coupon.api.requests.coupon;

import cn.vpclub.moses.core.model.request.PageBaseSearchParam;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author:yangqiao
 * @description:
 * @Date:2017/12/27
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class CouponLog extends PageBaseSearchParam {

    /**
     * 主键
     */
    private Long id;

    /**
     * 应用编号
     */
    private Long appId;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 买家手机号
     */
    private String buyerPhone;

    /**
     * 卖家名称
     */
    private String sellerName;

    /**
     * 成功与否标识
     */
    private Integer returnCode;

    /**
     * 成功与否描述
     */
    private String returnCodeDesc;

    /**
     * 下单时间
     */
    private Long orderTime;

    /**
     * 下单时间-str
     */
    private String orderTimeStr;

    /**
     * 下单时间开始
     */
    private Long orderTimeStart;

    /**
     * 下单时间结束
     */
    private Long orderTimeEnd;

    /**
     * 发券时间
     */
    private Long couponTime;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商户Id
     */
    private Long merchantId;

    /**
     * 发放状态,0-未处理，1-成功，2-失败
     */
    private String sendCouponStatus;
    /**
     * 发放状态,0-未处理，1-成功，2-失败-描述
     */
    private String sendCouponStatusDesc;
}