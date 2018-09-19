package cn.vpclub.coupon.api.commands.coupon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.io.Serializable;

/**
 * @author:yangqiao
 * @description:新增卡券命令
 * @Date:2017/12/12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCouponCommand implements Serializable {

    @TargetAggregateIdentifier
    private Long id;

    private Long appId;
    /**
     * 名称
     */
    private String name;
    /**
     * 批次号
     */
    private String batchNo;
    /**
     * 关联商户
     */
    private Long relatedBusiness;
    /**
     * 关联商品
     */
    private Long relatedGoods;
    /**
     * 卡券使用有效期起始日期
     */
    private Long effectiveDateStart;
    /**
     * 卡券使用有效期终止日期
     */
    private Long effectiveDateEnd;
    /**
     * 卡券使用有效期终止日期
     */
    private Long offDate;
    /**
     * 是否失效，1-未失效，2-已失效
     */
    private Integer invalid;
    /**
     * 失效人
     */
    private Long invalidBy;
    /**
     * 失效时间
     */
    private Long invalidTime;
}