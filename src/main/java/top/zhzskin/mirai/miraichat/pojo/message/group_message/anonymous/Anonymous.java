package top.zhzskin.mirai.miraichat.pojo.message.group_message.anonymous;

public class Anonymous {
    long id; //	number (int64)	匿名用户 ID
    String name; //	string	匿名用户名称
    String flag; //	string	匿名用户 flag，在调用禁言 API 时需要传入

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }
}
