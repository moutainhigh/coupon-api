package cn.vpclub.coupon.api.commands.o2ocoupon;

import cn.vpclub.coupon.api.entity.ProductThirdpartyRelated;
import cn.vpclub.moses.common.api.events.pay.OrderPaidEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.io.Serializable;

/**
 * @author:yangqiao
 * @description:生成肯德基O2O卡券命令
 * @Date:2017/12/12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateKFCO2OCouponCommand implements Serializable {

    @TargetAggregateIdentifier
    private Long id;

    /**
     * 订单支付事件
     */
    private OrderPaidEvent orderPaidEvent;

    /**
     * 本系统商品与第三方商品关联关系
     */
    private ProductThirdpartyRelated productThirdpartyRelated;
}