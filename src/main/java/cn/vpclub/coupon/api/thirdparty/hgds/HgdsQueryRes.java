package cn.vpclub.coupon.api.thirdparty.hgds;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author:zhangyingdong
 * @Date:2017/01/30
 */
@Data
@Accessors(chain = true)
public class HgdsQueryRes {

    private String orderNo ;//订单编号 ANS0..50 √  与生码请求中的一致
    private String cardId ;//卡 ID N0..20 √  卡 ID（接入商可忽略该字段）
    private String cardNo ;//卡号 ANS0..100   卡号
    private String codeId ;//验证码 ID ANS0..20 √  制码方生成的验证码的唯一 ID
    private String code ;//电子码 ANS0..50 √  电子码目前包括三种格式： 1.URL；2.数字串号；3.卡号和密 码。
    private String surl ;//二维码短链接 ANS0..100   二维码短链接
    private String codeStatus ;//电子码状态 N1 √  电子码状态: 0、未使用   1、已使用 2、已过期   3、已作废
    private String valiedStartDate ;//电子码有效开始时 间 N14   格式 yyyyMMddHHmmss
    private String valiedEndDate ;//电子码有效期结束 时间 N14   格式 yyyyMMddHHmmss
    private String createTime ;//电子码生成时间 N14 √  格式 yyyyMMddHHmmss
    private String goodsNo ;//渠道商品编号 ANS0..20 √  生码时请求的商品编号
}
