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
 * o2o券码
 * </p>
 *
 * @author yangqiao
 * @since 2017-12-22
 */
@Getter
@Setter
@ToString(callSuper = true)
@ApiModel("o2o券码-数据载体")
public class O2oCoupon extends BaseAbstractParameter {
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
     * 订单ID
     */
    @ApiModelProperty(value = "订单ID")
    private Long orderId;
    /**
     * 订单编号
     */
    @ApiModelProperty(value = "订单编号")
    private String orderNo;
    /**
     * 券码
     */
    @ApiModelProperty(value = "券码")
    private String couponCode;
    /**
     * 使用有效期起始日期
     */
    @ApiModelProperty(value = "使用有效期起始日期")
    private Long effectiveDateStart;
    /**
     * 使用有效期终止日期
     */
    @ApiModelProperty(value = "使用有效期终止日期")
    private Long effectiveDateEnd;
    /**
     * 买家id
     */
    @ApiModelProperty(value = "买家id")
    private Long buyerId;
    /**
     * 买家手机号码
     */
    @ApiModelProperty(value = "买家手机号码")
    private String buyerPhone;
    /**
     * 是否被使用，1-未使用，2-已使用
     */
    @ApiModelProperty(value = "是否被使用，1-未使用，2-已使用")
    private Integer consumed;
    /**
     * 是否被使用描述
     */
    @ApiModelProperty(value = "是否被使用描述")
    private String consumedDesc;
    /**
     * 使用时间
     */
    @ApiModelProperty(value = "使用时间")
    private Long consumedTime;
    /**
     * 验券人
     */
    @ApiModelProperty(value = "验券人")
    private Long validBy;
    /**
     * 验券机构
     */
    @ApiModelProperty(value = "验券机构")
    private Long validOrg;

    /**
     * 机构名称
     */
    @ApiModelProperty(value = "机构名称")
    private String orgName;
    /**
     * 机构电话
     */
    @ApiModelProperty(value = "机构电话")
    private String orgPhone;
    /**
     * 券码来源（0-平台发券，1-王者荣耀，2-肯德基，3-星巴克哈根达斯，4-搜狐,5-麦当劳）
     */
    @ApiModelProperty(value = "券码来源（0-平台发券，1-王者荣耀，2-肯德基，3-星巴克哈根达斯，4-搜狐,5-麦当劳）")
    private Integer couponSource;
}
