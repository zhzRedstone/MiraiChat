package top.zhzskin.mirai.miraichat.client;

import com.google.gson.Gson;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import top.zhzskin.mirai.miraichat.pojo.WsMessage;
import top.zhzskin.mirai.miraichat.pojo.meta.Meta;
import top.zhzskin.mirai.miraichat.pojo.meta.heartbeat.HeartBeat;
import top.zhzskin.mirai.miraichat.pojo.meta.lifecycle.LifeCycle;

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
        if(wsMessage.getPost_type().equals("meta_event")){
            Meta metaEvent = gson.fromJson(message, Meta.class);
            if (metaEvent.getMeta_event_type().equals("lifecycle")){
                LifeCycle lifeCycle = gson.fromJson(message,LifeCycle.class);
            } else if (metaEvent.getMeta_event_type().equals("heartbeat")){
                HeartBeat heartBeat = gson.fromJson(message,HeartBeat.class);
            }
        } else if (wsMessage.getPost_type().equals("message")){
         //todo 消息和事件处理分流和反序列化
        }
    }

    @Override
    public void onError(Exception ex) {

    }
    @Override
    public void onClose(int code, String reason, boolean remote) {
        
    }
}