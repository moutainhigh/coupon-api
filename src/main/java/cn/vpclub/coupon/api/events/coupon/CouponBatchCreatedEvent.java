package cn.vpclub.coupon.api.events.coupon;

import cn.vpclub.coupon.api.entity.Coupon;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author:yangqiao
 * @description:
 * @Date:2018/3/30
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class CouponBatchCreatedEvent {

    private Coupon coupon;
}