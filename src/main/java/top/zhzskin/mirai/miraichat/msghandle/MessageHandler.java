package top.zhzskin.mirai.miraichat.msghandle;

import org.bukkit.Bukkit;
import top.zhzskin.mirai.miraichat.pojo.message.group_message.GroupMessage;
import top.zhzskin.mirai.miraichat.pojo.message.private_message.PrivateMessage;
import top.zhzskin.mirai.miraichat.pojo.meta.heartbeat.HeartBeat;
import top.zhzskin.mirai.miraichat.pojo.meta.lifecycle.LifeCycle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class MessageHandler {
    public static long group;

    public static void setGroup(long group) {
        MessageHandler.group = group;
    }

    /*收到好友消息（包括群临时会话）*/
    public void receivePrivateMessage(PrivateMessage message){

    }
    /*收到群消息*/
    public void receiveGroupMessage(GroupMessage message){

        if (message.getGroup_id()==group){
            if (!Objects.equals(message.getSender().getCard(), "")){
                Bukkit.getServer().broadcastMessage(message.getSender().getCard()+":"+message.getMessage());
            } else {
                Bukkit.getServer().broadcastMessage(message.getSender().getNickname()+":"+message.getMessage());
            }
        }

    }
    /*生命周期*/
    public void onLifeCycle(LifeCycle lifeCycle){
        if (lifeCycle.getSub_type().equals("connect")){
            System.out.println(group);
            String res;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long lt = lifeCycle.getTime()*1000;
            Date date = new Date(lt);
            res = simpleDateFormat.format(date);
            Bukkit.getServer().getLogger().info("WebSocket 已连接，"+"时间:"+res);
        }
    }
    /*心跳*/
    public void onHeartBeat(HeartBeat heartBeat){

    }

}
