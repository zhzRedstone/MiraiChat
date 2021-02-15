package top.zhzskin.mirai.miraichat.pojo.message.private_message;

import top.zhzskin.mirai.miraichat.pojo.message.private_message.sender.Sender;

public class PrivateMessage {
    long time;//	number (int64)	-	事件发生的时间戳
    long self_id;//	number (int64)	-	收到事件的机器人 QQ 号
    String post_type;//	string	message	上报类型
    String message_type;//	string	private	消息类型
    String sub_type;//	string	friend、group、other	消息子类型，如果是好友则是 friend，如果是群临时会话则是 group
    int message_id;//	number (int32)	-	消息 ID
    long user_id;//	number (int64)	-	发送者 QQ 号
    String message;//	message	-	消息内容
    String raw_message;//	string	-	原始消息内容
    int font;//	number (int32)	-	字体
    Sender sender;//	object	-	发送人信息

    public long getTime() {
        return time;
    }
    public void setTime(long time) {
        this.time = time;
    }

    public long getSelf_id() {
        return self_id;
    }
    public void setSelf_id(long self_id) {
        this.self_id = self_id;
    }

    public String getPost_type() {
        return post_type;
    }
    public void setPost_type(String post_type) {
        this.post_type = post_type;
    }

    public String getMessage_type() {
        return message_type;
    }
    public void setMessage_type(String message_type) {
        this.message_type = message_type;
    }

    public String getSub_type() {
        return sub_type;
    }
    public void setSub_type(String sub_type) {
        this.sub_type = sub_type;
    }

    public int getMessage_id() {
        return message_id;
    }
    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

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

    public String getRaw_message() {
        return raw_message;
    }
    public void setRaw_message(String raw_message) {
        this.raw_message = raw_message;
    }

    public int getFont() {
        return font;
    }
    public void setFont(int font) {
        this.font = font;
    }

    public Sender getSender() {
        return sender;
    }
    public void setSender(Sender sender) {
        this.sender = sender;
    }
}
