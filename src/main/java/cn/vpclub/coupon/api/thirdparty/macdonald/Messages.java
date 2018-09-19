package cn.vpclub.coupon.api.thirdparty.macdonald;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Messages {
    private Sms Sms; //N
    private Mms Mms;// N
}
