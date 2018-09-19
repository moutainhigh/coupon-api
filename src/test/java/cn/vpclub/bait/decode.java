package cn.vpclub.bait;

import cn.vpclub.coupon.api.thirdparty.macdonald.util.UrlEncode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class decode {

    public static void main(String[] args) {
        String post="xml=%3C%3Fxml+version%3D%221.0%22+encoding%3D%22GBK%22%3F%3E%3CSubmitVerifyRes%3E%3CTransactionID%3E1803311342290359331%3C%2FTransactionID%3E%3CISSPID%3E00002066%3C%2FISSPID%3E%3CStatus%3E%3CStatusCode%3E5008%3C%2FStatusCode%3E%3CStatusText%3E%BB%EE%B6%AF%BB%F2%BA%CF%D4%BC%D2%EC%B3%A3%3C%2FStatusText%3E%3C%2FStatus%3E%3CMessageID%3E%3C%2FMessageID%3E%3CAssistNumber%3E%3C%2FAssistNumber%3E%3CWbmp%3E%3C%2FWbmp%3E%3C%2FSubmitVerifyRes%3E&mac=113b4c7b6121762923d57ef59bba82df";
        int endIndex= post.lastIndexOf("&mac");
        post=post.substring(4, post.lastIndexOf("&mac="));
        post = UrlEncode.decode(post, "gb2312");
        log.info("post:"+post.toString());
    }
}
