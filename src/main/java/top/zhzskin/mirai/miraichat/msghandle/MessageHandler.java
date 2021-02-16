package top.zhzskin.mirai.miraichat.msghandle;

import org.bukkit.Bukkit;
import top.zhzskin.mirai.miraichat.pojo.message.group_message.GroupMessage;
import top.zhzskin.mirai.miraichat.pojo.message.private_message.PrivateMessage;
import top.zhzskin.mirai.miraichat.pojo.meta.heartbeat.HeartBeat;
import top.zhzskin.mirai.miraichat.pojo.meta.lifecycle.LifeCycle;

public class MessageHandler {
    /*收到好友消息（包括群临时会话）*/
    public void receivePrivateMessage(PrivateMessage message){

    }
    /*收到群消息*/
    public void receiveGroupMessage(GroupMessage message){
        if (message.getGroup_id()==330986863L){
            Bukkit.getServer().broadcastMessage(message.getSender().getNickname()+":"+message.getMessage());
        }

    }
    /*生命周期*/
    public void onLifeCycle(LifeCycle lifeCycle){

    }
    /*心跳*/
    public void onHeartBeat(HeartBeat heartBeat){

    }

}
