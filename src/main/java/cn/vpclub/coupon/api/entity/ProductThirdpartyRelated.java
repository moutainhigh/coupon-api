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
 * 商品与第三方服务关联表
 * </p>
 *
 * @author yangqiao
 * @since 2017-12-22
 */

@Getter
@Setter
@ToString(callSuper = true)
@ApiModel("商品与第三方服务关联表-数据载体")
public class ProductThirdpartyRelated extends BaseAbstractParameter {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @NotNull(when = {ValidatorConditionType.READ,ValidatorConditionType.UPDATE,ValidatorConditionType.DELETE})
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
     * 商品ID
     */
    @ApiModelProperty(value = "商品sku")
	private Long skuId;
    /**
     * 商户ID
     */
    @ApiModelProperty(value = "商户ID")
	private Long merchantId;
    /**
     * 1-哈根达斯，2-肯德基
     */
    @ApiModelProperty(value = "1-哈根达斯，2-肯德基")
	private Integer serviceParty;
    /**
     * 服务地址1
     */
    @ApiModelProperty(value = "服务地址1")
	private String serviceUrl1;
    /**
     * 服务地址2
     */
    @ApiModelProperty(value = "服务地址2")
	private String serviceUrl2;
    /**
     * 服务地址3
     */
    @ApiModelProperty(value = "服务地址3")
	private String serviceUrl3;
    /**
     * 第三方方商品ID
     */
    @ApiModelProperty(value = "第三方方商品ID")
	private String thirdProductId;


}
