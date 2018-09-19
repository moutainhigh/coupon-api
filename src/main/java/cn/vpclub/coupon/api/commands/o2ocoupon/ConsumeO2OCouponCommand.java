package cn.vpclub.coupon.api.commands.o2ocoupon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.io.Serializable;

/**
 * @author:yangqiao
 * @description:消费O2O卡券命令
 * @Date:2017/12/12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumeO2OCouponCommand implements Serializable {

    @TargetAggregateIdentifier
    private Long id;

    /**
     * o2o_coupon表id
     */
    private Long o2oCouponId;
    /**
     * 验券人
     */
    private Long validBy;
    /**
     * 验券机构
     */
    private Long validOrg;

    /**
     * 机构名称
     */
    private String orgName;
    /**
     * 机构电话
     */
    private String orgPhone;
}