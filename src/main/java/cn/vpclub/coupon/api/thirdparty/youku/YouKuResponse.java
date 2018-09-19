package cn.vpclub.coupon.api.thirdparty.youku;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by zhangyingdong on 2018/6/26.
 */
@Data
@Accessors(chain = true)
public class YouKuResponse {
    private String FUNCODE;//	功能码
    private String MID;//业务流水号
    private String REQDATE;//请求日期
    private String REQTIME;//请求时间
    private String RETCODE;//返回码
    private String RETMSG;//返回信息
    private String MERID;//销售商编号
    private String ORDERID;//订单编号
    private String ORDERDATE;//订单日期
    private String COUPID;//活动编号;
    private String ISSUENO;//优惠券券码
    private String SHORTNAME;//活动简称
    private String EFFECTDATE;//生效日期
    private String EXPIREDATE;//失效日期
    private String SIGN;//签名

}
