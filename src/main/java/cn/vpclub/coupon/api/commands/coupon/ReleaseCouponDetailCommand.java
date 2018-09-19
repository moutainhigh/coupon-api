package cn.vpclub.coupon.api.commands.coupon;

import cn.vpclub.moses.common.api.events.pay.OrderPaidEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

/**
 * @author:yangqiao
 * @description:发放卡券
 * @Date:2018/3/29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReleaseCouponDetailCommand {

    @TargetAggregateIdentifier
    private Long id;

    private OrderPaidEvent orderPaidEvent;
}