package cn.vpclub.coupon.api.thirdparty.hgds;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author:zhangyingdong
 * @Date:2017/01/30
 */
@Data
@Accessors(chain = true)
public class HgdsQueryReq {
    private String paramType; //查询方式 N1 √  0、按照制码订单编号查询 1、按照验证码 ID 查询
    private String param ;//查询参数 ANS0..20 √  按照查询方式定义的查询参数
    private String channelNo ;//渠道商编号 ANS0..20 √  由汇安融提供
}
