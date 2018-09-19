package cn.vpclub.coupon.api.commands.coupon;

import cn.vpclub.coupon.api.entity.CouponDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.util.List;

/**
 * @author:yangqiao
 * @description:
 * @Date:2018/3/29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCouponDetailCommand {

    @TargetAggregateIdentifier
    private Long id;

    /**
     * 卡券类型批次号
     */
    private String couponTypeBatchNo;

    /**
     * 关联商品Sku
     */
    private Long relatedGoodsSku;

    private List<CouponDetail> couponDetailList;
}