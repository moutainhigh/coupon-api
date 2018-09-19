package cn.vpclub.bait;

import cn.vpclub.moses.web.jwt.JwtHelper;
import cn.vpclub.moses.web.jwt.JwtInfoProperties;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author:yangqiao
 * @description:
 * @Date:2017/12/27
 */
@Slf4j
public class Test {

    public static void main(String[] args) throws ParseException {
//        System.out.println(DateUtils.getStartTimeByDate("2018-01-19"));
        getToken();
//        formatDate();
    }

    public static void formatDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        System.out.println(sdf.format(1517486434000L));
    }

    public static String getToken() {
        JwtInfoProperties jwtInfoProperties = new JwtInfoProperties();
        String phone = "13517255710";
        Map map = new HashMap();
        String ip = "127.0.0.1";
        map.put("phone", phone);
        String auth = JwtHelper.createJWT(map, ip, "shop-consumer", "others", 1000 * 60 * 1000L, jwtInfoProperties
                .getBase64Secret());
        log.debug("token is :{}", auth);
        return auth;
    }

    private void getProperties() throws IOException {
        InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("thirdPartyConfig.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException ioE) {
            ioE.printStackTrace();
        } finally {
            inputStream.close();
        }
        System.out.println("name:" + properties.getProperty("kfc.pid"));
    }
}