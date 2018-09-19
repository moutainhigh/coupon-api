package cn.vpclub.coupon.api.thirdparty.xbkhgds;

import com.hazelcast.core.LifecycleService;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author:zhangyingdong
 * @Date:2018/02/28
 */
@Data
@Accessors(chain = true)
public class XbkHgdsResponse {
    private String Data;//返回的加密数据
    private String Sign;//返回签名
    private String MsgKey;//返回key
    private String AppId;//返回APPid
    private String RespCode;//返回标识值
    private String RespDesc;//返回描述
    private List<XbkHgdsResponseData> codes;//data解密后的集合
}
