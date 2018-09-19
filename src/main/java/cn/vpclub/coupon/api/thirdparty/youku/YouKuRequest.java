package cn.vpclub.coupon.api.thirdparty.youku;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by zhangyingdong on 2018/6/26.
 */
@Data
@Accessors(chain = true)
@XmlRootElement
public class YouKuRequest {

    private String FUNCODE;//	功能码
    private String MID;//业务流水号
    private String MERID;//销售商编号
    private String REQDATE;//请求日期
    private String REQTIME;//请求时间
    private String ORDERID;//订单编号
    private String ORDERDATE;//订单日期
    private String COUPID;//活动编号;
    private String COUNT;//券码数量
    private String CHANNEL;//渠道类型
    private String MEDIANO;//媒介编号
    private String MEDIATYPE;//媒介类型
    private String SIGN;//签名

}
