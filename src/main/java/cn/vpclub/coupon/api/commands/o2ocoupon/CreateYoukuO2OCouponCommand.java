package cn.vpclub.coupon.api.commands.o2ocoupon;

import cn.vpclub.coupon.api.entity.O2oCoupon;
import cn.vpclub.moses.common.api.events.pay.OrderPaidEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.util.List;

/**
 * Created by zhangyingdong on 2018/6/29.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateYoukuO2OCouponCommand {
    @TargetAggregateIdentifier
    private Long id;

    private O2oCoupon o2oCoupon;

    private OrderPaidEvent orderPaidEvent;
}
