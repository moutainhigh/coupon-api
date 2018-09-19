package cn.vpclub.coupon.api.commands.other;

import cn.vpclub.moses.common.api.events.pay.OrderPaidEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

/**
 * Created by zhangyingdong on 2018/7/11.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCodeStatusCommand {
    @TargetAggregateIdentifier
    private Long id;

    private String code;
    private OrderPaidEvent orderPaidEvent;
}
