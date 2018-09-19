package cn.vpclub.coupon.api.requests.o2ocoupon;

import cn.vpclub.moses.core.model.request.PageBaseSearchParam;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author:yangqiao
 * @description:
 * @Date:2017/12/12
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class O2OCouponMixRequest extends PageBaseSearchParam {

    /**
     * 主键id
     */
    private Long id;
    /**
     * 应用id
     */
    private Long appId;
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 买家id
     */
    private Long buyerId;
    /**
     * 当前登录人的所属orgId
     */
    private Long currentUserOrgId;
    /**
     * 商品ID
     */
    private Long productId;
    /**
     * 商品skuID
     */
    private Long skuId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 卖家id
     */
    private Long merchantId;
    /**
     * 卖家名称
     */
    private String sellerName;
    /**
     * 券码
     */
    private String couponCode;
    /**
     * 使用有效期起始日期
     */
    private Long effectiveDateStart;

    /**
     * 使用有效期起始日期-Str
     */
    private String effectiveDateStartStr;
    /**
     * 使用有效期终止日期
     */
    private Long effectiveDateEnd;
    /**
     * 使用有效期终止日期-Str
     */
    private String effectiveDateEndStr;

    /**
     * 使用有效期
     */
    private String effectiveDateStr;

    /**
     * 是否被使用，1-未使用，2-已使用
     */
    private Integer consumed;
    /**
     * 是否被使用描述
     */
    private String consumedDesc;
    /**
     * 使用时间
     */
    private Long consumedTime;
    /**
     * 使用时间-Str
     */
    private String consumedTimeStr;
    /**
     * 使用时间开始
     */
    private Long consumedTimeStart;
    /**
     * 使用时间结束
     */
    private Long consumedTimeEnd;
    /**
     * 使用时间开始-日期
     */
    private String consumedDateStart;
    /**
     * 使用时间结束-日期
     */
    private String consumedDateEnd;
    /**
     * 买家手机号码
     */
    private String buyerPhone;
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
    /**
     * 创建时间
     */
    private Long createdTime;
    /**
     * 商品封面图片
     */
    private String coverImage;

    /**
     * 商品销售金额
     */
    private Integer sellPrice;

    /**
     * 商品生效时间
     */
    private Long productEffectTimeStart;
    /**
     * 商品失效时间
     */
    private Long productEffectTimeEnd;
    /**
     * 订单编号
     */
    private String mainOrderNo;
    /**
     * 主订单id
     */
    private Long mainOrderId;
    /**
     * 子主订单id
     */
    private Long subOrderId;
    /**
     * 下单时间
     */
    private Long orderTime;
    /**
     * 下单时间-str
     */
    private String orderTimeStr;
    /**
     * 卡券创建时间
     */
    private Long couponTime;
    /**
     * 卡券创建时间-str
     */
    private String couponTimeStr;
    /**
     * 发票抬头
     */
    private String invoiceTitle;
    /**
     * 买家备注
     */
    private String buyerRemark;
    /**
     * 验券月份
     */
    private String consumedMonth;
    /**
     * 验券总金额-按月
     */
    private Integer consumedAmountMonthSum;
    /**
     * 验券总金额
     */
    private Integer consumedAmountSum;
    /**
     * 验证日期
     */
    private String consumedDay;
    /**
     * 验券总金额-按日
     */
    private Integer consumedAmountDaySum;
    /**
     * 验券单数
     */
    private Integer consumedCount;

    /**
     * 卡券发放状态
     */
    private String sendCouponStatus;
}