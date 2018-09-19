package cn.vpclub.coupon.api.commands.other;

import cn.vpclub.coupon.api.entity.ThirdPartyCouponLog;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

/**
 * @author:yangqiao
 * @description:
 * @Date:2018/1/11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThirdPartyCouponLogCommand {

    @TargetAggregateIdentifier
    private Long id;

    private ThirdPartyCouponLog thirdPartyCouponLog;

    private int doType;
}