package cn.vpclub.coupon.api.commands.coupon;

import cn.vpclub.coupon.api.entity.Coupon;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.io.Serializable;

/**
 * @author:yangqiao
 * @description:新增卡券命令
 * @Date:2017/12/12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCouponBatchCommand implements Serializable {

    @TargetAggregateIdentifier
    private Long id;

    private Coupon coupon;
}