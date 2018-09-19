package cn.vpclub.coupon.api.thirdparty.macdonald;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Recipients {
    private String Number;//条码凭证接收号
}
