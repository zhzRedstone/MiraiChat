package top.zhzskin.mirai.miraichat.pojo.notice.group_upload;

public class File {
    String id;//	string	文件 ID
    String name;//	string	文件名
    long size;//	number (int64)	文件大小（字节数）
    long busid;//	number (int64)	busid（目前不清楚有什么作用）

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }
    public void setSize(long size) {
        this.size = size;
    }

    public long getBusid() {
        return busid;
    }
    public void setBusid(long busid) {
        this.busid = busid;
    }
}
