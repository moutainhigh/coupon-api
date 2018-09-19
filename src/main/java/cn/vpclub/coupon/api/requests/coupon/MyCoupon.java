package cn.vpclub.coupon.api.requests.coupon;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author:yangqiao
 * @description:
 * @Date:2018/1/2
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class MyCoupon {
    /**
     * 主键
     */
    private Long id;

    /**
     * 应用编号
     */
    private Long appId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 买家手机号
     */
    private String buyerPhone;
    /**
     * 买家Id
     */
    private Long buyerId;
    /**
     * 卖家名称
     */
    private String sellerName;
    /**
     * 下单时间
     */
    private Long orderTime;
    /**
     * 卡券领取时间
     */
    private Long couponTime;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品销售价格
     */
    private Long sellPrice;
    /**
     * 买家留言
     */
    private String buyerRemark;
    /**
     * 卡号
     */
    private String cardNo;
    /**
     * 商品skuID
     */
    private Long skuId;
    /**
     * 密码
     */
    private String cardPwd;

    /**
     * 使用有效期起始日期
     */
    private Long effectiveDateStart;
    /**
     * 使用有效期终止日期
     */
    private Long effectiveDateEnd;
    /**
     * 使用有效期
     */
    private String effectiveDateStr;
    /**
     * 卡券消费时间
     */
    private Long consumedTime;
    /**
     * 商品封面图片地址
     */
    private String coverImage;
    /**
     * 发票抬头
     */
    private String invoiceTitle;
    /**
     * 卡券是否消费
     */
    private Integer consumed;
    /**
     * 卡券是否消费描述
     */
    private String consumedDesc;
    /**
     * 券码号
     */
    private String couponCode;
    /**
     * 订单id
     */
    private Long orderId;
}