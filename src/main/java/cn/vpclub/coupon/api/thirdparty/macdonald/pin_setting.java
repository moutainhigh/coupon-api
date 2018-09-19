package cn.vpclub.coupon.api.thirdparty.macdonald;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * zhangyingdong 2018.2.7
 */
@Data
@Accessors(chain = true)
public class pin_setting {

    private String pin_md5;//凭证使用密码  N
    private Number pin_try_times;//连续密码错误最大次数  N
}
