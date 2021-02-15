package top.zhzskin.mirai.miraichat.pojo.message.private_message.sender;

public class Sender {
    long user_id;//	number (int64)	发送者 QQ 号
    String nickname;//	string	昵称
    String sex;//	string	性别，male 或 female 或 unknown
    int age;//	number (int32)	年龄

    public long getUser_id() {
        return user_id;
    }
    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
