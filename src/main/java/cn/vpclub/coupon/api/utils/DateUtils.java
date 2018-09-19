package cn.vpclub.coupon.api.utils;

import cn.vpclub.coupon.api.constants.CouponConstant;
import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author:yangqiao
 * @description:
 * @Date:2018/1/24
 */
@Slf4j
public class DateUtils {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    /**
     * 根据日期格式得到当天0点0分0秒的时间毫秒数
     */
    public static Long getStartTimeByDate(String date) throws ParseException {
        return sdf.parse(date + " " + CouponConstant.DAY_TIME_START).getTime();//毫秒
    }

    /**
     * 根据日期格式得到当天23点59分59秒的时间毫秒数
     */
    public static Long getEndTimeByDate(String date) throws ParseException {
        return sdf.parse(date + " " + CouponConstant.DAY_TIME_END).getTime();//毫秒
    }
}