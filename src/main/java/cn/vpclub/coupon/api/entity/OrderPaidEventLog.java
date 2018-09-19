package cn.vpclub.coupon.api.entity;

import cn.vpclub.moses.utils.validator.BaseAbstractParameter;
import cn.vpclub.moses.utils.constant.ValidatorConditionType;
import cn.vpclub.moses.utils.validator.annotations.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 订单支付成功事件日志表
 * </p>
 *
 * @author yangqiao
 * @since 2017-12-22
 */
@Getter
@Setter
@ToString(callSuper = true)
@ApiModel("订单支付成功事件日志表-数据载体")
public class OrderPaidEventLog extends BaseAbstractParameter {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @NotNull(when = {ValidatorConditionType.READ, ValidatorConditionType.UPDATE, ValidatorConditionType.DELETE})
    private Long id;
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private Long createdBy;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Long createdTime;
    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人")
    private Long updatedBy;
    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Long updatedTime;
    /**
     * 删除标识(1:在线; 2:删除)
     */
    @ApiModelProperty(value = "删除标识(1:在线; 2:删除)")
    private Integer deleted;
    /**
     * app_id
     */
    @ApiModelProperty(value = "app_id")
    private Long appId;
    /**
     * 主订单id
     */
    @ApiModelProperty(value = "主订单id")
    private Long mainOrderId;
    /**
     * 主订单编号
     */
    @ApiModelProperty(value = "主订单编号")
    private String mainOrderNo;
    /**
     * 子订单id
     */
    @ApiModelProperty(value = "子订单id")
    private Long subOrderId;
    /**
     * 子订单编号
     */
    @ApiModelProperty(value = "子订单编号")
    private String subOrderNo;
    /**
     * 订单项id
     */
    @ApiModelProperty(value = "订单项id")
    private Long orderItemId;
    /**
     * 8-O2O订单 9-卡密订单
     */
    @ApiModelProperty(value = "8-O2O订单 9-卡密订单")
    private String purchaseType;
    /**
     * 买家id
     */
    @ApiModelProperty(value = "买家id")
    private Long buyerId;
    /**
     * 买家姓名
     */
    @ApiModelProperty(value = "买家姓名")
    private String buyerName;
    /**
     * 买家手机号
     */
    @ApiModelProperty(value = "买家手机号")
    private String buyerPhone;
    /**
     * 商品SKU
     */
    @ApiModelProperty(value = "商品SKU")
    private Long skuId;
    /**
     * 商品id
     */
    @ApiModelProperty(value = "商品id")
    private Long productId;
    /**
     * 商品快照ID
     */
    @ApiModelProperty(value = "商品快照ID")
    private Long productSnapshotId;
    /**
     * 商品编码
     */
    @ApiModelProperty(value = "商品编码")
    private String productCode;
    /**
     * 商品名称
     */
    @ApiModelProperty(value = "商品名称")
    private String productName;
    /**
     * 商品数量
     */
    @ApiModelProperty(value = "商品数量")
    private Long buyQty;
    /**
     * 卖家id
     */
    @ApiModelProperty(value = "卖家id")
    private Long merchantId;
    /**
     * 卖家名称
     */
    @ApiModelProperty(value = "卖家名称")
    private String sellerName;

    /**
     * 订单支付事件对象信息
     */
    @ApiModelProperty("订单支付事件对象信息")
    private String orderPaidInfo;


    /**
     * 买家备注
     */
    @ApiModelProperty("买家备注")
    private String buyerRemark;
    /**
     * 发票抬头
     */
    @ApiModelProperty("发票抬头")
    private String invoiceTitle;
    /**
     * 商品销售金额
     */
    @ApiModelProperty("商品销售金额")
    private Integer sellPrice;

    /**
     * 商品封面图片
     */
    @ApiModelProperty("商品封面图片")
    private String coverImage;
    /**
     * 商品生效时间
     */
    @ApiModelProperty(value = "商品生效时间")
    private Long productEffectTimeStart;
    /**
     * 商品失效时间
     */
    @ApiModelProperty(value = "商品失效时间")
    private Long productEffectTimeEnd;

    /**
     * 卡券发放状态
     */
    @ApiModelProperty("卡券发放状态")
    private String sendCouponStatus;
}
