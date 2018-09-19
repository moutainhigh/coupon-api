package cn.vpclub.coupon.api.thirdparty.hgds;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author:zhangyingdong
 * @Date:2017/01/30
 */
@Data
@Accessors(chain = true)
public class HgdsRevokeReq {
    private String  paramType ;//撤销方式 N1 √  0、按照制码订单编号撤销
    private String  param ;//撤销参数 ANS0..20 √  按照撤销方式定义的撤销参数
    private String  channelNo ;//渠道商编号 ANS0..20 √  由汇安融提供
}
