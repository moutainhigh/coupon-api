package cn.vpclub.coupon.api.thirdparty.xbkhgds;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class XbkHgdsResponseData {
     private String cardNo;//卡号
     private String cardId;//卡 ID
     private String createTime;//电子码生成时间
     private String codeId;//验证码 ID
     private String orderNo;//订单编号
     private String valiedStartDate;// 电子码有效开始时 间
     private String surl;//二维码短链接
     private String code;//电子码,真实券码
     private String valiedEndtDate;// 电子码有效结束时 间

     public static void main(String[] args) {

         String json = "{\"codes\":[{\"cardNo\":\"\",\"cardId\":\"437478\",\"createTime\":\"20180323103134\",\"codeId\":\"879886\",\"orderNo\":\"976651127653654535\",\"valiedStartDate\":\"20180201200034\",\"surl\":\"http://localhost:8080/rqURuy3P\",\"code\":\"3201978786211\",\"valiedEndDate\":\"20180430151648\"}]}";
         com.alibaba.fastjson.JSONObject jsonObject = JSON.parseObject(json);
         List<XbkHgdsResponseData> codes= JSON.parseArray(jsonObject.getJSONArray("codes").toString(),XbkHgdsResponseData.class);
     }
}
