package cn.vpclub.coupon.api.constants;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:yangqiao
 * @description:常量类
 * @Date:2017/12/12
 */
public class CouponConstant {

    /**
     * appId
     */
    public static Long XQJ_APP_ID = 100000060L;
    /**
     * appId
     */
    public static Long BAIT_APP_ID = 10000168L;

    /**
     * O2O卡券是否使用-未使用
     */
    public static int O2O_COUPON_CONSUMED_N = 1;
    /**
     * O2O卡券是否使用-已使用
     */
    public static int O2O_COUPON_CONSUMED_Y = 2;

    /**
     * 第三方服务标识-王者荣耀
     */
    public static int SERVICE_PARTY_KINGGLORY = 1;
    /**
     * 第三方服务标识-肯德基
     */
    public static int SERVICE_PARTY_KFC = 2;

    /**
     * 第三方服务标识-星巴克哈根达斯
     */
    public static int SERVICE_PARTY_XBK_HGDS = 3;

    /**
     * 第三方服务标识-搜狐
     */
    public static int SERVICE_PARTY_SOHU = 4;
    /**
     * 第三方服务标识-麦当劳
     */
    public static int SERVICE_PARTY_MacDonald = 5;
    /**
     * 第三方服务标识-优酷
     */
    public static int SERVICE_PARTY_YOUKU = 6;
    /**
     * 第三方服务标识-pptv
     */
    public static int SERVICE_PARTY_PPTV = 7;
    /**
     * 第三方服务标识-爱奇艺
     */
    public static int SERVICE_PARTY_IQIYI = 8;

    /**
     * 服务标识-平台
     */
    public static int SERVICE_PARTY_PLATFORM = 0;

    /**
     * 肯德基返回成功标志
     */
    public static String KFC_RETURN_CODE_SUCCESS = "0000";
    /**
     * 星巴克哈根达斯返回成功标识
     */
    public static String XBK_HGDS_RETURN_CODE_SUCCESS = "00";
    /**
     * 星巴克哈根达斯返回失败（制码失败）标识
     */
    public static String XBK_HGDS_RETURN_CODE_FAILED = "01";
    /**
     * 星巴克哈根达斯返回失败（已制码，拒绝重复制码）标识
     */
    public static String XBK_HGDS_RETURN_CODE_FAILED__DUPLICATE = "03";
    /**
     * 搜狐返回成功标志
     */
    public static String SOHU_RETURN_CODE_SUCCESS = "0000";

    /**
     * 麦当劳返回成功标识
     */
    public static String MACDONALD_RETURN_CODE_SUCCESS = "0000";
    /**
     * 王者荣耀返回成功标志1
     */
    public static String KINGGLORY_RETURN_CODE_SUCCESS = "106";
    /**
     * 王者荣耀返回成功标志2
     */
    public static String KINGGLORY_RETURN_CODE_SUCCESS_FIRST = "104";
    /**
     * 王者荣耀返回成功标志3
     */
    public static String KINGGLORY_RETURN_CODE_SUCCESS_TWO = "105";
    /**
     * 优酷返回成功标志
     */
    public static String YOUKU_RETURN_CODE_SUCCESS = "0000";
    /**
     * PPTV返回成功标志
     */
    public static String PPTV_RETURN_CODE_SUCCESS = "0";
    /**
     * 第三方服务调用成功与否标识-成功
     */
    public static int THIRD_PARTY_SERVICE_FLAG_SUCCESS = 1;

    /**
     * 第三方服务调用成功与否标识-失败
     */
    public static int THIRD_PARTY_SERVICE_FLAG_FAILED = 2;
    /**
     * 是否重发短信-否
     */
    public static int RESENDMSG_STATUS_N = 1;
    /**
     * 是否重发短信-是
     */
    public static int RESENDMSG_STATUS_Y = 2;
    /**
     * 是否分配-否
     */
    public static int ALLOCATION_STATUS_N = 1;
    /**
     * 是否分配-是
     */
    public static int ALLOCATION_STATUS_Y = 2;
    /**
     * 是否删除标识-否
     */
    public static int DELETED_N = 1;
    /**
     * 是否删除标识-是
     */
    public static int DELETED_Y = 2;
    /**
     * 是否失效标识-否
     */
    public static int INVALID_N = 1;
    /**
     * 是否失效标识-是
     */
    public static int INVALID_Y = 2;
    /**
     * 第三方服务调用返回描述-发放成功
     */
    public static String THIRD_PARTY_SERVICE_FLAG_SUCCESS_DESC = "发放成功";
    /**
     * 第三方服务调用返回描述-发放失败
     */
    public static String THIRD_PARTY_SERVICE_FLAG_FAILED_DESC = "发放失败";

    /**
     * 操作标识-新增
     */
    public static int DO_TYPE_INSERT = 1;

    /**
     * 操作标识-修改
     */
    public static int DO_TYPE_UPDATE = 2;

    /**
     * 操作标识-删除
     */
    public static int DO_TYPE_DELETE = 3;

    /**
     * 卡券短信模板key
     */
    public static String COUPON_SMS_TEMP_KEY = "coupon_send";

    /**
     * o2o卡券短信模板key
     */
    public static String O2O_COUPON_SMS_TEMP_KEY = "o2o_coupon_send";
    /**
     * 爱奇艺短信模板key
     */
    public static String Iqiyi_COUPON_SMS_TEMP_KEY = "iqiyi_coupon_send";

    /**
     * 日期开始时间
     */
    public static String DAY_TIME_START = "00:00:00";

    /**
     * 日期结束时间
     */
    public static String DAY_TIME_END = "23:59:59";

    /**
     * 卡券发放状态-0-未发放
     */
    public static String SEND_COUPON_STATUS_UNTREATED = "1";

    /**
     * 卡券发放状态-1-未发放
     */
    public static String SEND_COUPON_STATUS_SUCCESS = "2";

    /**
     * 卡券发放状态-2-未发放
     */
    public static String SEND_COUPON_STATUS_FAILED = "3";

    /**
     * 是否已下架，1-未下架
     */
    public static int OFF_STATUS_N = 1;

    /**
     * 是否已下架，2-已下架
     */
    public static int OFF_STATUS_Y = 2;

    /**
     * 平台名称
     */
    public final static Map appMap = new HashMap() {{
        put(BAIT_APP_ID, "优品");
        put(XQJ_APP_ID, "寻秦集");
    }};

    /**
     * 可管理所有卡券角色CODE-企业管理员
     */
    public static String ROLECODE_QYGLY = "admin_qy";

    /**
     * 可管理所有卡券角色CODE-运营管理员
     */
    public static String ROLECODE_YYGLY = "admin_yy";
}