package cn.vpclub.coupon.api.commands.other;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

import java.io.Serializable;

/**
 * @author:yangqiao
 * @description:卡券重发命令
 * @Date:2018/1/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateOrderSuccessCommand implements Serializable {

    @TargetAggregateIdentifier
    private Long id;

    private Long mainOrderId;

}