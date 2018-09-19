package cn.vpclub.coupon.api.thirdparty.macdonald;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@Accessors(chain = true)
@XmlRootElement(name="SubmitVerifyRes")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "TransactionID","ISSPID", "Status","Wbmp","AssistNumber","MessageID","ShortUrlInfo" })
public class SubmitVerifyRes {
    private String TransactionID;//请求流水号\
    private String ISSPID;//接入sp的id号，为翼码凭证平台提供的业务商机构号
    private Status Status;
    private String Wbmp;//wbmp图片数据
    private String AssistNumber;//返回的辅助码、真实的券码
    private String MessageID;//信息标识
    private String ShortUrlInfo;//辅助码短链

    public String getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(String transactionID) {
        TransactionID = transactionID;
    }

    public String getWbmp() {
        return Wbmp;
    }

    public void setWbmp(String wbmp) {
        Wbmp = wbmp;
    }

    public String getAssistNumber() {
        return AssistNumber;
    }

    public void setAssistNumber(String assistNumber) {
        AssistNumber = assistNumber;
    }

    public String getMessageID() {
        return MessageID;
    }

    public void setMessageID(String messageID) {
        MessageID = messageID;
    }

    public String getShortUrlInfo() {
        return ShortUrlInfo;
    }

    public void setShortUrlInfo(String shortUrlInfo) {
        ShortUrlInfo = shortUrlInfo;
    }

    public String getISSPID() {
        return ISSPID;
    }

    public void setISSPID(String ISSPID) {
        this.ISSPID = ISSPID;
    }

    public cn.vpclub.coupon.api.thirdparty.macdonald.Status getStatus() {
        return Status;
    }

    public void setStatus(cn.vpclub.coupon.api.thirdparty.macdonald.Status status) {
        Status = status;
    }
}

