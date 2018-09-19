package cn.vpclub.coupon.api.events.o2ocoupon;

import cn.vpclub.coupon.api.entity.O2oCoupon;
import cn.vpclub.moses.common.api.events.pay.OrderPaidEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author:yangqiao
 * @description:
 * @Date:2017/12/12
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class O2OCouponCreatedEvent {

    private List<O2oCoupon> o2oCouponList;

    private OrderPaidEvent orderPaidEvent;
}