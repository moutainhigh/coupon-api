package cn.vpclub.coupon.api.thirdparty.kfc;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author:yangqiao
 * @description:
 * @Date:2017/12/21
 */
@Data
@Accessors
public class KFCResponse {

    private String orderId;//请求过来的订单号
    private String retResult;//微能订单号
    private String exchangeCode;//如生成的码数量为多个，则以“;”分隔反馈多个，“，”分隔码和金额，格式为：1111111111,5000;2222222222,20表示返回一个50元码，一个20元码
    private String codeValidity;//编码有效期
    private String wnOrderId;//微能订单号
    //不一定有的字段
    private String remark;//附加内容,根据需要设置内容。肯德基：使用说明
    private String shortUrlQrList;//券码二维码短链接,如生成的券码为多个，则返回多个二维码短链接，多个短链接之间用“，”分隔，格式为：http://t.cn/RVSuRvx,http://t
    // .cn/RVSuRvx”，异步出码的时候，无
    private String shortUrlBarList;//券码条码短链接,如生成的券码为多个，则返回多个条码短链接，多个短链接之间用“，”分隔，格式为：http://t.cn/RVSuRvx,http://t
    // .cn/RVSuRvx”，异步出码的时候，无
    private String shortUrlBarAndQrList;//券码与条码组合短链接,如生成的券码为多个，则返回多个条码与二维码组合短链接，多个短链接之间用“，”分隔，格式为：http://t.cn/RVSuRvx,http://t
    // .cn/RVSuRvx”，异步出码的时候，无

}