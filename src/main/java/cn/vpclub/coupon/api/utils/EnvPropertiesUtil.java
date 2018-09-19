package cn.vpclub.coupon.api.utils;

//获取环境变量,入参是SPRING_PROFILES_ACTIVE，关键是本地环境变量需要配置这个=local
public class EnvPropertiesUtil {

    public static String getEnv(String propName){
        return  System.getenv().get(propName);
    }

}
