package cn.vpclub.coupon.api.thirdparty.sohu;

import cn.vpclub.coupon.api.thirdparty.kfc.Security;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.BeanUtils;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class ProtocolService {
    static public String getSignMd5(SohuRequest sohuRequest) throws UnsupportedEncodingException
    {
        String url = getURL(sohuRequest);
        return Security.MD5(url);
    }

    static public String getURL(SohuRequest sohuRequest) throws UnsupportedEncodingException
    {
        Field[] field = sohuRequest.getClass().getDeclaredFields();
        String md5 = "";
        for(int i=0;i<field.length;i++){
            try {
                String value = (String) PropertyUtils.getProperty(sohuRequest,field[0].getName()) ;
                String key=field[0].getName();
                if(key !=null){
                    md5 += key+"="+ URLEncoder.encode(value, "UTF-8")+"&";
                }else{
                    md5 += key+"=&";
                }
            } catch (IllegalAccessException e) {
                log.error("IllegalAccessException e:{}",e);
            } catch (InvocationTargetException e) {
                log.error("InvocationTargetException e:{}",e);
            } catch (NoSuchMethodException e) {
                log.error("NoSuchMethodException e:{}",e);
            }
        }
        md5 = md5.substring(0,md5.length()-1);
        return md5;
    }
}
