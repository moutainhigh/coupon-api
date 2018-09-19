package cn.vpclub.coupon.api.events.o2ocoupon;

import cn.vpclub.moses.common.api.events.pay.OrderPaidEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:yangqiao
 * @description:
 * @Date:2017/12/12
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class KFCO2OCouponCreatedEvent {

    private Long id;

    private String kfcProdId;

    private String pid;

    private String password;

    private String http;

    private String daysValidity;

    /**
     * 订单支付事件
     */
    private OrderPaidEvent orderPaidEvent;

}