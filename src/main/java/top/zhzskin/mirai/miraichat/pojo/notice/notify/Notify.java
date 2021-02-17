package top.zhzskin.mirai.miraichat.pojo.notice.notify;

public class Notify {
    String post_type;//	string	notice	上报类型
    String notice_type;//	string	notify	消息类型
    String sub_type;//	string	lucky_king	提示类型

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
}
