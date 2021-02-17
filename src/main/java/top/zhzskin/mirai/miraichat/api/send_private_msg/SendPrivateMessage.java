package top.zhzskin.mirai.miraichat.api.send_private_msg;

import top.zhzskin.mirai.miraichat.api.Param;

public class SendPrivateMessage extends Param {
    long user_id;//	int64	-	对方 QQ 号
    String message;//	message	-	要发送的内容
    boolean auto_escape;//	boolean	false	消息内容是否作为纯文本发送 ( 即不解析 CQ 码 ) , 只在 message 字段是字符串时有效

    public long getUser_id() {
        return user_id;
    }
    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isAuto_escape() {
        return auto_escape;
    }
    public void setAuto_escape(boolean auto_escape) {
        this.auto_escape = auto_escape;
    }
}
