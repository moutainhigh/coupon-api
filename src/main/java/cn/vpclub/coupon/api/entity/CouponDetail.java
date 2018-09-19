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
 * 卡券表
 * </p>
 *
 * @author yangqiao
 * @since 2017-12-22
 */

@Getter
@Setter
@ToString(callSuper = true)
@ApiModel("卡券表-数据载体")
public class CouponDetail extends BaseAbstractParameter {
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
     * 卡号
     */
    @ApiModelProperty(value = "卡号")
    private String cardNo;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String cardPwd;
    /**
     * 卡券类型批次号
     */
    @ApiModelProperty(value = "卡券类型批次号")
    private String couponTypeBatchNo;
    /**
     * 订单编号
     */
    @ApiModelProperty(value = "订单编号")
    private String orderNo;
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
     * 是否被分配，1-未分配，2-已分配
     */
    @ApiModelProperty(value = "是否被分配，1-未分配，2-已分配")
    private Integer allocationStatus;
    /**
     * 发放时间
     */
    @ApiModelProperty(value = "发放时间")
    private Long releaseTime;
    /**
     * 短信内容
     */
    @ApiModelProperty(value = "短信内容")
    private String msgContent;
    /**
     * 是否重发过短信，1-未重发，2-已重发
     */
    @ApiModelProperty(value = "是否重发过短信，1-未重发，2-已重发")
    private Integer resendMsgStatus;
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
     * 订单ID
     */
    @ApiModelProperty(value = "订单ID")
    private Long orderId;

    /**
     * 券码来源（0-平台发券，1-哈根达斯，2-肯德基）
     */
    @ApiModelProperty(value = "券码来源（0-平台发券，1-哈根达斯，2-肯德基）")
    private Integer couponSource;
}
