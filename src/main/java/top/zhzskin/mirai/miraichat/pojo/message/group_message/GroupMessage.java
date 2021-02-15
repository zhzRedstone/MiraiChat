package top.zhzskin.mirai.miraichat.pojo.message.group_message;

import top.zhzskin.mirai.miraichat.pojo.message.group_message.anonymous.Anonymous;
import top.zhzskin.mirai.miraichat.pojo.message.group_message.sender.Sender;

public class GroupMessage {
    long time; //	number (int64)	-	事件发生的时间戳
    long self_id; //	number (int64)	-	收到事件的机器人 QQ 号
    String post_type; //	string	message	上报类型
    String message_type; //	string	group	消息类型
    String sub_type; //	string	normal、anonymous、notice	消息子类型，正常消息是 normal，匿名消息是 anonymous，系统提示（如「管理员已禁止群内匿名聊天」）是 notice
    long message_id; //	number (int32)	-	消息 ID
    long group_id; //	number (int64)	-	群号
    long user_id; //	number (int64)	-	发送者 QQ 号
    Anonymous anonymous; //	object	-	匿名信息，如果不是匿名消息则为 null
    String message; //	message	-	消息内容
    String raw_message; //	string	-	原始消息内容
    int font; //	number (int32)	-	字体
    Sender sender; //	object	-	发送人信息
}
