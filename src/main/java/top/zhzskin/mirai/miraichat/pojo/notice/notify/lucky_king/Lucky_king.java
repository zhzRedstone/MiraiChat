package top.zhzskin.mirai.miraichat.pojo.notice.notify.lucky_king;

public class Lucky_king {
    String post_type;//	string	notice	上报类型
    String notice_type;//	string	notify	消息类型
    String sub_type;//	string	lucky_king	提示类型
    long group_id;//    int64		群号
    long user_id;// 	int64		红包发送者 QQ 号
    long target_id;//	int64		运气王 QQ 号

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

    public String getSub_type() {
        return sub_type;
    }
    public void setSub_type(String sub_type) {
        this.sub_type = sub_type;
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

    public long getTarget_id() {
        return target_id;
    }
    public void setTarget_id(long target_id) {
        this.target_id = target_id;
    }
}
