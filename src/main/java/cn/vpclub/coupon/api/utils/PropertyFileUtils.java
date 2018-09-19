package cn.vpclub.coupon.api.utils;


import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author:yangqiao
 * @description:
 * @Date:2017/12/28
 */
@Slf4j
public class PropertyFileUtils {

    private static Map<String, Properties> propMap = new HashMap<String, Properties>();

        public static Properties getProperties(String fileUrl) throws IOException {

            if (propMap.get(fileUrl) != null) {
                return propMap.get(fileUrl);
            }
            log.info("进入读取配置文件");
            InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(fileUrl);
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            propMap.put(fileUrl, properties);
        } catch (IOException ioE) {
            ioE.printStackTrace();
        } finally {
            inputStream.close();
        }
        log.info("返回读取出的文件");
        return properties;
    }

    public static String getProperties(String fileUrl, String propertyName) throws IOException {
        InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(fileUrl);
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException ioE) {
            ioE.printStackTrace();
        } finally {
            inputStream.close();
        }
        return properties.getProperty(propertyName);
    }
}