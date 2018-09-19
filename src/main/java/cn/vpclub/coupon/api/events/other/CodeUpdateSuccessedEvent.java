package cn.vpclub.coupon.api.events.other;

import cn.vpclub.moses.common.api.events.pay.OrderPaidEvent;
import cn.vpclub.moses.core.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Created by zhangyingdong on 2018/7/11.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class CodeUpdateSuccessedEvent extends BaseEntity {

    private Long id;

    private String code;
    private OrderPaidEvent orderPaidEvent;

}
