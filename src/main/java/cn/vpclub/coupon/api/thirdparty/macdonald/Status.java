package cn.vpclub.coupon.api.thirdparty.macdonald;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.xml.bind.annotation.*;

/**
 * zhangyingdong 2018.2.8
 */
@Accessors(chain = true)
@Data
public  class Status {
    private Number StatusCode;//处理应答码
    private String StatusText;//处理应答解释

    public Number getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(Number statusCode) {
        StatusCode = statusCode;
    }

    public String getStatusText() {
        return StatusText;
    }

    public void setStatusText(String statusText) {
        StatusText = statusText;
    }

    @Override
    public String toString() {
        return "Status{" +
                "StatusCode=" + StatusCode +
                ", StatusText='" + StatusText + '\'' +
                '}';
    }

    public Status(Number statusCode, String statusText) {
        StatusCode = statusCode;
        StatusText = statusText;
    }
    public Status(){
        super();
    }

}
