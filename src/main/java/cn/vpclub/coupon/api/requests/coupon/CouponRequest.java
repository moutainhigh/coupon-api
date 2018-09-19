package cn.vpclub.coupon.api.requests.coupon;

import cn.vpclub.moses.utils.validator.AbstractGenericParameter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author:yangqiao
 * @description:
 * @Date:2017/12/13
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class CouponRequest extends AbstractGenericParameter {
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

    /**
     * 下架日期开始日期
     */
    private Long offDateStart;
    /**
     * 下架日期结束日期
     */
    private Long offDateEnd;
    /**
     * 卡券使用有效期起始日期开始日期
     */
    private Long effectiveDateStartStart;
    /**
     * 卡券使用有效期起始日期结束日期
     */
    private Long effectiveDateStartEnd;
    /**
     * 卡券使用有效期终止日期开始日期
     */
    private Long effectiveDateEndStart;
    /**
     * 卡券使用有效期终止日期结束日期
     */
    private Long effectiveDateEndEnd;
}