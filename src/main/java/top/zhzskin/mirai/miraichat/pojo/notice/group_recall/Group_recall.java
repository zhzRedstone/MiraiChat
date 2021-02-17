package top.zhzskin.mirai.miraichat.pojo.notice.group_recall;

public class Group_recall {
    long time;//	number (int64)	-	事件发生的时间戳
    long self_id;//	number (int64)	-	收到事件的机器人 QQ 号
    String post_type;//	string	notice	上报类型
    String notice_type;//	string	group_recall	通知类型
    long group_id;//	number (int64)		群号
    long user_id;//	number (int64)		消息发送者 QQ 号
    long operator_id;//	number (int64)		操作者 QQ 号
    long message_id;//	number (int64)		被撤回的消息 ID

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

    public String getNotice_type() {
        return notice_type;
    }
    public void setNotice_type(String notice_type) {
        this.notice_type = notice_type;
    }

    public long getGroup_id() {
        return group_id;
    }
    public void setGroup_id(long group_id) {
        this.group_id = group_id;
    }

    public long getUser_id() {
        return user_id;
    }
    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getOperator_id() {
        return operator_id;
    }
    public void setOperator_id(long operator_id) {
        this.operator_id = operator_id;
    }

    public long getMessage_id() {
        return message_id;
    }
    public void setMessage_id(long message_id) {
        this.message_id = message_id;
    }
}
