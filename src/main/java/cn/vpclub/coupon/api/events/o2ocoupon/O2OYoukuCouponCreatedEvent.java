package cn.vpclub.coupon.api.events.o2ocoupon;

import cn.vpclub.coupon.api.entity.O2oCoupon;
import cn.vpclub.moses.common.api.events.pay.OrderPaidEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Created by zhangyingdong on 2018/6/29.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class O2OYoukuCouponCreatedEvent {

    private O2oCoupon o2oCoupon;

    private OrderPaidEvent orderPaidEvent;
}
