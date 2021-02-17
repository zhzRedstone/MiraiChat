package top.zhzskin.mirai.miraichat.api.send_group_msg;

import top.zhzskin.mirai.miraichat.api.Param;

public class SendGroupMessage extends Param {
    long group_id;//	int64	-	群号
    String message;//	message	-	要发送的内容
    boolean auto_escape;//	boolean	false	消息内容是否作为纯文本发送 ( 即不解析 CQ 码) , 只在 message 字段是字符串时有效

    public long getGroup_id() {
        return group_id;
    }
    public void setGroup_id(long group_id) {
        this.group_id = group_id;
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
