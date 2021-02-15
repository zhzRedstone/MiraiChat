package top.zhzskin.mirai.miraichat.pojo.meta.heartbeat;

public class HeartBeat {
    long time; //	number (int64)	-	事件发生的时间戳
    long self_id; //	number (int64)	-	收到事件的机器人 QQ 号
    String post_type; //	string	meta_event	上报类型
    String meta_event_type;//	string	heartbeat	元事件类型
    Status status;//	object	-	状态信息
    int interval;//	number (int64)	-	到下次心跳的间隔，单位毫秒

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

    public String getMeta_event_type() {
        return meta_event_type;
    }
    public void setMeta_event_type(String meta_event_type) {
        this.meta_event_type = meta_event_type;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public int getInterval() {
        return interval;
    }
    public void setInterval(int interval) {
        this.interval = interval;
    }
}

