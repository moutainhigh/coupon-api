package cn.vpclub.coupon.api.thirdparty.hgds;

import lombok.Data;
import lombok.experimental.Accessors;
/**
 * @author:zhangyingdong
 * @Date:2017/01/30
 */
@Data
@Accessors(chain = true)
public class HgdsCodeReq {
    private String orderNo;         //订单编号 ANS0..20 √  此编号由申请生码方提供，唯 一且不重复。
    private String goodsNo;         //商品编号 ANS0..20 √  由汇安融提供
    private String channelNo;       //渠道商编号 ANS0..20 √  由汇安融提供
    private String goodsPrice;      //商品单价 N…9 √  单位分
    private String valiedStartDate; //电子码有效开始时 间 N14   格式 yyyyMMddHHmmss，以响 应报文为准。
    private String valiedEndDate;   //电子码有效结束时 间 N14   格式 yyyyMMddHHmmss，以响 应报文为准。
    private String phone;           //用户手机号码 N11   用户手机号码
    private String goodsCount;      //商品数量 N11 √  商品数量
    private String appId; //汇安融分配的AppId
    private String  MsgKey;
    private String PartnerId;//汇安融分配的PartnerId

}
