package cn.vpclub.coupon.api.thirdparty.hgds;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class HttpUtil {

	private HttpUtil(){
	}

	public static String post(String url, String reqParam) throws Exception {
		
		HttpClient httpClient = new HttpClient();

		// 请求url
		PostMethod method = new PostMethod(url);
	
		// 设置请求编码UTF-8
		method.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
		method.addRequestHeader(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
		
		RequestEntity entity = new StringRequestEntity(reqParam);
		
        method.setRequestEntity(entity);

        // 执行post请求
		httpClient.executeMethod(method);
		
		// 请求返回
		String respResult = method.getResponseBodyAsString();
		
		// 释放连接
		method.releaseConnection();
		
		return respResult;
	}
}
