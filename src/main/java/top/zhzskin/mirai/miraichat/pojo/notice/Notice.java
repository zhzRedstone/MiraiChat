package top.zhzskin.mirai.miraichat.pojo.notice;

public class Notice {
    long time;//	number (int64)	-	事件发生的时间戳
    long self_id;//	number (int64)	-	收到事件的机器人 QQ 号
    String post_type;//	string	notice	上报类型
    String notice_type;//	string	group_upload	通知类型
    //todo 群禁言
    //todo 好友添加
    //todo 群消息撤回
    //todo 好友消息撤回
    //todo 群内戳一戳
    //todo 群红包运气王
    //todo 群成员荣誉变更

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
}
