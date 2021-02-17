package top.zhzskin.mirai.miraichat.pojo.notice.friend_add;

public class Friend_add {
    long time;//	number (int64)	-	事件发生的时间戳
    long self_id;//	number (int64)	-	收到事件的机器人 QQ 号
    String post_type;//	string	notice	上报类型
    String notice_type;//	string	friend_add	通知类型
    long user_id;//	number (int64)	-	新添加好友 QQ 号

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

    public long getUser_id() {
        return user_id;
    }
    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}
