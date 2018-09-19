package cn.vpclub.coupon.api.requests.coupon;

import cn.vpclub.coupon.api.entity.CouponDetail;
import cn.vpclub.moses.core.model.request.PageBaseSearchParam;
import cn.vpclub.moses.utils.constant.ValidatorConditionType;
import cn.vpclub.moses.utils.validator.annotations.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author:yangqiao
 * @description:
 * @Date:2017/12/13
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class CouponMixRequest extends PageBaseSearchParam {
    /**
     * 应用id
     */
    @NotNull(when = {ValidatorConditionType.CREATE})
    private Long appId;
    /**
     * 主键
     */
    private Long id;
    /**
     * 批次号
     */
    private String batchNo;
    /**
     * 批次号,同batchNo
     */
    private String couponTypeBatchNo;
    /**
     * 名称
     */
    @NotNull(when = {ValidatorConditionType.CREATE})
    private String name;
    /**
     * 关联商户
     */
    @NotNull(when = {ValidatorConditionType.CREATE})
    private Long relatedBusiness;
    /**
     * 关联商户名称
     */
    @NotNull(when = {ValidatorConditionType.CREATE})
    private String relatedBusinessName;
    /**
     * 关联商品
     */
    @NotNull(when = {ValidatorConditionType.CREATE})
    private Long relatedGoods;
    /**
     * 商品sku
     */
    @NotNull(when = {ValidatorConditionType.CREATE})
    private Long relatedGoodsSku;
    /**
     * 关联商品名称
     */
    @NotNull(when = {ValidatorConditionType.CREATE})
    private String relatedGoodsName;
    /**
     * 卡券使用有效期起始日期
     */
    private String effectiveDateStartStr;
    /**
     * 卡券使用有效期终止日期
     */
    private String effectiveDateEndStr;
    /**
     * 卡券使用有效期起始日期
     */
    @NotNull(when = {ValidatorConditionType.CREATE})
    private Long effectiveDateStart;
    /**
     * 卡券使用有效期终止日期
     */
    @NotNull(when = {ValidatorConditionType.CREATE})
    private Long effectiveDateEnd;

    /**
     * 创建日期str
     */
    private String createdTimeStr;
    /**
     * 下架日期
     */
    private String offDateStr;
    /**
     * 下架日期
     */
    @NotNull(when = {ValidatorConditionType.CREATE})
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
     * 下架日期开始日期-str
     */
    private String offDateStartStr;
    /**
     * 下架日期结束日期-str
     */
    private String offDateEndStr;
    /**
     * 卡券使用有效期起始日期开始日期
     */
    private Long effectiveDateStartStart;
    /**
     * 卡券使用有效期起始日期结束日期
     */
    private Long effectiveDateStartEnd;

    /**
     * 卡券使用有效期起始日期开始日期-str
     */
    private String effectiveDateStartStartStr;
    /**
     * 卡券使用有效期起始日期结束日期-str
     */
    private String effectiveDateStartEndStr;

    /**
     * 卡券使用有效期终止日期开始日期
     */
    private Long effectiveDateEndStart;
    /**
     * 卡券使用有效期终止日期结束日期
     */
    private Long effectiveDateEndEnd;

    /**
     * 卡券使用有效期终止日期开始日期-str
     */
    private String effectiveDateEndStartStr;
    /**
     * 卡券使用有效期终止日期结束日期-str
     */
    private String effectiveDateEndEndStr;
    /**
     * 卡券使用有效期-str
     */
    private String effectiveDateStr;

    private List<CouponDetail> records;
    /**
     * 购买数量
     */
    private Integer buyQty;
    /**
     * skuId
     */
    private Long skuId;
    /**
     * 是否已下架，1-正常，2-已下架
     */
    private Integer offStatus;
    /**
     * 是否已下架，正常，已下架
     */
    private String offStatusDesc;

    /**
     * 更新人
     */
    private Long updatedBy;
    /**
     * 是否失效，1-未失效，2-已失效
     */
    private Integer invalid;
    /**
     * 失效人
     */
    private Long invalidBy;

    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 卡号
     */
    private String cardNo;
    /**
     * 密码
     */
    private String cardPwd;
    /**
     * 买家手机号
     */
    private String buyerPhone;
    /**
     * 券码状态
     */
    private String couponDetailStatus;

    /**
     * 券码状态-描述
     */
    private String couponDetailStatusDesc;
    /**
     * 是否被分配，1-未分配，2-已分配
     */
    private Integer allocationStatus;
    /**
     * 发放时间
     */
    private Long releaseTime;
    /**
     * 发放时间str
     */
    private String releaseTimeStr;

    /**
     * 子订单id
     */
    private Long mainOrderId;

    /**
     * 子订单id
     */
    private Long subOrderId;

    /**
     * 卡券发放状态（0-未处理，1-发放成功，2-发放失败）
     */
    private String sendCouponStatus;

    /**
     * 卡券发放状态（0-未处理，1-发放成功，2-发放失败）-描述
     */
    private String sendCouponStatusDesc;

    /**
     * 当前操作者
     */
    private Long currentUserId;

    /**
     * 当前操作者orgId
     */
    private List<String> currentUserOrgIds;
}