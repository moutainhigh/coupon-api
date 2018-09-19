package cn.vpclub.coupon.api.entity;

import cn.vpclub.moses.utils.constant.ValidatorConditionType;
import cn.vpclub.moses.utils.validator.BaseAbstractParameter;
import cn.vpclub.moses.utils.validator.annotations.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 爱奇艺卡券表
 * </p>
 *
 * @author zhangyingdong
 * @since 2018-7-10
 */
@Getter
@Setter
@ToString(callSuper = true)
@ApiModel("爱奇艺卡券表-数据载体")
public class CouponIqiyi extends BaseAbstractParameter {

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
    private String createdTime;
    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人")
    private Long updatedBy;
    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private String updatedTime;
    /**
     * 是否删除，1-未删除，2-已删除
     */
    @ApiModelProperty(value = "是否删除，1-未删除，2-已删除")
    private Integer deleted;
    /**
     * 订单编号
     */
    @ApiModelProperty(value = "订单编号")
    private String orderNo;

    /**
     * 商品ID
     */
    @ApiModelProperty(value = "商品id")
    private Long productId;
    /**
     * 卡号
     */
    @ApiModelProperty(value = "券码号")
    private String cardNo;
    /**
     * 密钥
     */
    @ApiModelProperty(value = "密钥")
    private String cardPwd;
    /**
     * 使用有效期起始日期
     */
    @ApiModelProperty(value = "券码使用有效期起始日期")
    private String effectiveDateStart;
    /**
     * 使用有效期终止日期
     */
    @ApiModelProperty(value = "券码使用有效期终止日期")
    private String effectiveDateEnd;
    /**
     * 品类编码
     */
    @ApiModelProperty(value = "品类编码")
    private String configCode;

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
    @ApiModelProperty(value = "是否被分配")
    private Integer allocationStatus;
    /**
     * 发放时间
     */
    @ApiModelProperty(value = "发放时间")
    private String releaseTime;
    /**
     * 短信内容
     */
    @ApiModelProperty(value = "短信内容")
    private String msgContent;


}
