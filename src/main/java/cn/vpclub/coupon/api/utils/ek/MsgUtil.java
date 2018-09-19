package cn.vpclub.coupon.api.utils.ek;

import cn.vpclub.coupon.api.utils.JSONUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class MsgUtil {

    private static final Logger log = LoggerFactory.getLogger(MsgUtil.class);

    public static boolean send10086Msg(String userId, String content) {
        boolean flag = false;

        Map<String, String> object = new HashMap<String, String>();
        //亚信获取用户资料接口
        object.put("userId", userId);
        object.put("content", content);

        String reqUrl = ErkuaiModUtil.msgSendBaseUrl + "/message/send/10086";

        String result = ErkuaiModUtil.request(reqUrl, object);
        log.info("send10086Msg userId =>" + userId + ",result =>" + result);
        if (StringUtils.isNotBlank(result)) {
            String code = (String) JSONUtils.toMap(result).get("code");
            if ("0".equals(code)) {
                flag = true;
            }
        }
        return flag;
    }
}
