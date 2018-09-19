package cn.vpclub.coupon.api.events.coupon;

import cn.vpclub.coupon.api.entity.CouponDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author:yangqiao
 * @description:
 * @Date:2018/3/30
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class CouponDetailCreatedEvent {

    private List<CouponDetail> couponDetailList;
}