package cn.vpclub.coupon.api.events.coupon;

import cn.vpclub.moses.common.api.events.pay.OrderPaidEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author:yangqiao
 * @description:
 * @Date:2018/3/30
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class CouponDetailReleasedEvent {

    /**
     * 订单支付事件
     */
    private OrderPaidEvent orderPaidEvent;
}