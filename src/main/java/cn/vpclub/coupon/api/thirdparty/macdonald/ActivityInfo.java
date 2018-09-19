package cn.vpclub.coupon.api.thirdparty.macdonald;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ActivityInfo {
    private String ActivityID;//活动号
    private String BeginTime;//开始时间 N
    private String EndTime;//结束时间   N
    private Number OrgTimes;//活动可使用次数
    private Number OrgAmt;//活动可使用金额
    private String PrintText;//活动打印内容

}
