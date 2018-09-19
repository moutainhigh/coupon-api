package cn.vpclub.coupon.api.thirdparty.sohu;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author:zhangyingdong
 * @Date:2017/01/31
 */
@Data
@Accessors(chain = true)
public class SohuResponse {

    private String orderId;//换购订单号
    private String wnOrderId;//微能订单号
    private String retResult;//结果
    private String exchangeCode;//兑换编码
    private String codeValidity;//编码有效期
    private String shortUrlQrList;//券码二维码短链接  N
    private String shortUrlBarList;//券码条码短链接  N
    private String shortUrlBarAndQrList;//券码与条码组合短链接  N
    private String remark;//附加内容   N
}
