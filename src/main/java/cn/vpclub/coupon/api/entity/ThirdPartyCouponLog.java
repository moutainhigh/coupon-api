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
 * 第三方发券服务调用日志表
 * </p>
 *
 * @author yangqiao
 * @since 2017-12-22
 */

@Getter
@Setter
@ToString(callSuper = true)
@ApiModel("第三方发券服务调用日志表-数据载体")
public class ThirdPartyCouponLog extends BaseAbstractParameter {
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
     * 子订单id
     */
    @ApiModelProperty(value = "子订单id")
    private Long subOrderId;
    /**
     * 1-哈根达斯，2-肯德基
     */
    @ApiModelProperty(value = "1-哈根达斯，2-肯德基")
    private Integer serviceParty;
    /**
     * 请求地址
     */
    @ApiModelProperty(value = "请求地址")
    private String serviceUrl;
    /**
     * 请求报文
     */
    @ApiModelProperty(value = "请求报文")
    private String requestContext;
    /**
     * 响应报文
     */
    @ApiModelProperty(value = "响应报文")
    private String responseContext;
    /**
     * 响应标识（1-成功，2-失败）
     */
    @ApiModelProperty(value = "响应标识（1-成功，2-失败）")
    private Integer returnCode;


}
