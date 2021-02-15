package top.zhzskin.mirai.miraichat.pojo.meta.lifecycle;

public class LifeCycle {
    long time;
    long self_id;
    String post_type;
    String meta_event_type;
    String sub_type;

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

    public String getSub_type() {
        return sub_type;
    }
    public void setSub_type(String sub_type) {
        this.sub_type = sub_type;
    }

}
