package cn.vpclub.coupon.api.commands.o2ocoupon;

import cn.vpclub.coupon.api.entity.O2oCoupon;
import cn.vpclub.moses.common.api.events.pay.OrderPaidEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.io.Serializable;
import java.util.List;

/**
 * @author:yangqiao
 * @description:生成O2O卡券命令
 * @Date:2017/12/12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateO2OCouponCommand implements Serializable {

    @TargetAggregateIdentifier
    private Long id;

    private List<O2oCoupon> o2oCouponList;

    private OrderPaidEvent orderPaidEvent;
}