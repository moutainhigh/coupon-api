package cn.vpclub.coupon.api.events.o2ocoupon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:yangqiao
 * @description:
 * @Date:2017/12/12
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CouponCreatedEvent {
    private Long id;
    /**
     * 应用id
     */
    private Long appId;
    /**
     * 批次号
     */
    private String batchNo;
    /**
     * 名称
     */
    private String name;
    /**
     * 关联商户
     */
    private Long relatedBusiness;
    /**
     * 关联商品
     */
    private Long relatedGoods;
    /**
     * 卡券使用有效期起始日期
     */
    private Long effectiveDateStart;
    /**
     * 卡券使用有效期终止日期
     */
    private Long effectiveDateEnd;
    /**
     * 卡券使用有效期终止日期
     */
    private Long offDate;


}