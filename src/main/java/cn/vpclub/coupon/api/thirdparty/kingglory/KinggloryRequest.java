package cn.vpclub.coupon.api.thirdparty.kingglory;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class KinggloryRequest {
    private String gameCode;//游戏编码，默认为1
    private String orderCode;//订单编号
    private String phoneNo;//用户手机号
    private String name;//用户实名制姓名
    private String amount;//点券面额
}
