package cn.vpclub.coupon.api.events.o2ocoupon;

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
public class ConsumeO2OCouponEvent {
    /**
     * o2o_coupon表id
     */
    private Long o2oCouponId;

    /**
     * 验券人
     */
    private Long validBy;
    /**
     * 验券机构
     */
    private Long validOrg;

    /**
     * 机构名称
     */
    private String orgName;
    /**
     * 机构电话
     */
    private String orgPhone;
}