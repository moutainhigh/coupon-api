package cn.vpclub.coupon.api.thirdparty.macdonald;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Mms {
    private String Subject;//彩信标题
    private String Text;//彩信内容
}
