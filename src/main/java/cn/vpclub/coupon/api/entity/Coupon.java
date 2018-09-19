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
 * 卡券类型表
 * </p>
 *
 * @author yangqiao
 * @since 2017-12-22
 */

@Getter
@Setter
@ToString(callSuper = true)
@ApiModel("卡券类型表-数据载体")
public class Coupon extends BaseAbstractParameter {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @NotNull(when = {ValidatorConditionType.READ, ValidatorConditionType.UPDATE, ValidatorConditionType.DELETE})
    private Long id;
    /**
     * 应用编号
     */
    @ApiModelProperty(value = "应用编号")
    private Long appId;
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
     * 是否删除，1-未删除，2-已删除
     */
    @ApiModelProperty(value = "是否删除，1-未删除，2-已删除")
    private Integer deleted;
    /**
     * 批次号
     */
    @ApiModelProperty(value = "批次号")
    private String batchNo;
    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;
    /**
     * 关联商户
     */
    @ApiModelProperty(value = "关联商户")
    private Long relatedBusiness;
    /**
     * 关联商户名称
     */
    @ApiModelProperty(value = "关联商户名称")
    private String relatedBusinessName;
    /**
     * 关联商品productId
     */
    @ApiModelProperty(value = "关联商品productId")
    private Long relatedGoods;
    /**
     * 关联商品Sku
     */
    @ApiModelProperty(value = "关联商品Sku")
    private Long relatedGoodsSku;
    /**
     * 关联商品Name
     */
    @ApiModelProperty(value = "关联商品Name")
    private String relatedGoodsName;
    /**
     * 卡券使用有效期起始日期
     */
    @ApiModelProperty(value = "卡券使用有效期起始日期")
    private Long effectiveDateStart;
    /**
     * 卡券使用有效期终止日期
     */
    @ApiModelProperty(value = "卡券使用有效期终止日期")
    private Long effectiveDateEnd;
    /**
     * 下架日期
     */
    @ApiModelProperty(value = "下架日期")
    private Long offDate;
    /**
     * 是否失效，1-未失效，2-已失效
     */
    @ApiModelProperty(value = "是否失效，1-未失效，2-已失效")
    private Integer invalid;
    /**
     * 失效人
     */
    @ApiModelProperty(value = "失效人")
    private Long invalidBy;
    /**
     * 失效时间
     */
    @ApiModelProperty(value = "失效时间")
    private Long invalidTime;

    /**
     * 库存
     */
    @ApiModelProperty(value = "库存")
    private Integer inventory;

    /**
     * 是否已下架，1-正常，2-已下架
     */
    @ApiModelProperty(value = "是否已下架，1-正常，2-已下架")
    private Integer offStatus;
}
