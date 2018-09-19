package cn.vpclub.coupon.api.events.other;

import cn.vpclub.coupon.api.entity.ThirdPartyCouponLog;
import cn.vpclub.moses.core.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author:yangqiao
 * @description:
 * @Date:2017/12/12
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class ThirdPartyCouponLogEvent extends BaseEntity {

    private ThirdPartyCouponLog thirdPartyCouponLog;

    private int doType;

}