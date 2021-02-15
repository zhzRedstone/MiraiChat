package top.zhzskin.mirai.miraichat.pojo.message.group_message.sender;

public class Sender {
    long user_id; //	number (int64)	发送者 QQ 号
    String nickname; //	string	昵称
    String card; //	    string	群名片／备注
    String sex; //	    string	性别，male 或 female 或 unknown
    int age; //	        number (int32)	年龄
    String area; //	    string	地区
    String level; //	string	成员等级
    String role; //	    string	角色，owner 或 admin 或 member
    String title; //	string	专属头衔

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

    public String getCard() {
        return card;
    }
    public void setCard(String card) {
        this.card = card;
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

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
