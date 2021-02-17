package top.zhzskin.mirai.miraichat.pojo;

public class WsMessage {
    long time; //    事件发生的时间戳
    long self_id; // 收到事件的机器人 QQ 号
    String post_type; //事件类型:
    //                     request：todo 请求事件
    public void setTime(long time) {
        this.time = time;
    }
    public long getTime() {
        return time;
    }

    public void setSelf_id(long self_id) {
        this.self_id = self_id;
    }
    public long getSelf_id() {
        return self_id;
    }

    public void setPost_type(String post_type){
        this.post_type=post_type;
    }
    public String getPost_type() {
        return post_type;
    }

}
