package cn.vpclub.coupon.api.thirdparty.macdonald;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Sms {
    private String Text;//短信内容
}
