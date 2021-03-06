package top.zhzskin.mirai.miraichat.client;

import com.google.gson.Gson;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import top.zhzskin.mirai.miraichat.msghandle.MessageHandler;
import top.zhzskin.mirai.miraichat.pojo.WsMessage;
import top.zhzskin.mirai.miraichat.pojo.message.Message;
import top.zhzskin.mirai.miraichat.pojo.message.group_message.GroupMessage;
import top.zhzskin.mirai.miraichat.pojo.message.private_message.PrivateMessage;
import top.zhzskin.mirai.miraichat.pojo.meta.Meta;
import top.zhzskin.mirai.miraichat.pojo.meta.heartbeat.HeartBeat;
import top.zhzskin.mirai.miraichat.pojo.meta.lifecycle.LifeCycle;
import top.zhzskin.mirai.miraichat.pojo.notice.Notice;
import top.zhzskin.mirai.miraichat.pojo.notice.friend_add.Friend_add;
import top.zhzskin.mirai.miraichat.pojo.notice.friend_recall.Friend_recall;
import top.zhzskin.mirai.miraichat.pojo.notice.group_admin.Group_admin;
import top.zhzskin.mirai.miraichat.pojo.notice.group_ban.Group_ban;
import top.zhzskin.mirai.miraichat.pojo.notice.group_decrease.Group_decrease;
import top.zhzskin.mirai.miraichat.pojo.notice.group_increase.Group_increase;
import top.zhzskin.mirai.miraichat.pojo.notice.group_recall.Group_recall;
import top.zhzskin.mirai.miraichat.pojo.notice.group_upload.Group_upload;
import top.zhzskin.mirai.miraichat.pojo.notice.notify.Notify;
import top.zhzskin.mirai.miraichat.pojo.notice.notify.honor.Honor;
import top.zhzskin.mirai.miraichat.pojo.notice.notify.lucky_king.Lucky_king;
import top.zhzskin.mirai.miraichat.pojo.notice.notify.poke.Poke;

import java.net.URI;
import java.net.URISyntaxException;
public class WsClient extends WebSocketClient {
    Gson gson = new Gson();

    public WsClient(String url) throws URISyntaxException {
        super(URI.create(url));
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {

    }

    @Override
    public void onMessage(String message) {
        WsMessage wsMessage = gson.fromJson(message,WsMessage.class);
        switch (wsMessage.getPost_type()) {
            case "meta_event":
                Meta metaEvent = gson.fromJson(message, Meta.class);
                if (metaEvent.getMeta_event_type().equals("lifecycle")) {
                    LifeCycle lifeCycle = gson.fromJson(message, LifeCycle.class);//构造对象：生命周期
                    MessageHandler messageHandler = new MessageHandler();
                    messageHandler.onLifeCycle(lifeCycle);
                } else if (metaEvent.getMeta_event_type().equals("heartbeat")) {
                    HeartBeat heartBeat = gson.fromJson(message, HeartBeat.class);//构造对象：心跳
                    MessageHandler messageHandler = new MessageHandler();
                    messageHandler.onHeartBeat(heartBeat);
                }
                break;
            case "message":
                Message msg = gson.fromJson(message, Message.class);
                if (msg.getMessage_type().equals("private")) {
                    PrivateMessage privateMessage = gson.fromJson(message, PrivateMessage.class);//构造对象：私聊消息
                    //交给MessageHandler处理
                    MessageHandler messageHandler = new MessageHandler();
                    messageHandler.receivePrivateMessage(privateMessage);
                } else if (msg.getMessage_type().equals("group")) {
                    GroupMessage groupMessage = gson.fromJson(message, GroupMessage.class);//构造对象：群消息
                    //交给MessageHandler处理
                    MessageHandler messageHandler = new MessageHandler();
                    messageHandler.receiveGroupMessage(groupMessage);
                }
                break;
            case "notice":
                Notice notice = gson.fromJson(message, Notice.class);
                switch (notice.getNotice_type()) {
                    case "group_upload":
                        Group_upload groupUpload = gson.fromJson(message, Group_upload.class);
                        break;
                    case "group_admin":
                        Group_admin groupAdmin = gson.fromJson(message, Group_admin.class);
                        break;
                    case "group_decrease":
                        Group_decrease groupDecrease = gson.fromJson(message, Group_decrease.class);
                        break;
                    case "group_increase":
                        Group_increase groupIncrease = gson.fromJson(message, Group_increase.class);
                        break;
                    case "group_ban":
                        Group_ban groupBan = gson.fromJson(message,Group_ban.class);
                        break;
                    case "friend_add":
                        Friend_add friendAdd = gson.fromJson(message,Friend_add.class);
                        break;
                    case "group_recall":
                        Group_recall groupRecall = gson.fromJson(message,Group_recall.class);
                        break;
                    case "friend_recall":
                        Friend_recall friendRecall = gson.fromJson(message,Friend_recall.class);
                        break;
                    case "notify":
                        Notify notify = gson.fromJson(message,Notify.class);
                        switch (notify.getSub_type()){
                            case "lucky_king":
                                Lucky_king luckyKing =gson.fromJson(message,Lucky_king.class);
                                break;
                            case "poke":
                                Poke poke = gson.fromJson(message,Poke.class);
                                break;
                            case "honor":
                                Honor honor = gson.fromJson(message,Honor.class);
                                break;
                        }
                }
                break;
        }
        //todo 请求处理 要将事件实现
    }

    @Override
    public void onError(Exception ex) {

    }
    @Override
    public void onClose(int code, String reason, boolean remote) {
        
    }
}