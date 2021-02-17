package top.zhzskin.mirai.miraichat.api;

import com.google.gson.Gson;
import top.zhzskin.mirai.miraichat.api.send_group_msg.SendGroupMessage;
import top.zhzskin.mirai.miraichat.api.send_private_msg.SendPrivateMessage;

public class ApiBuilder {
    Gson gson = new Gson();
    public String sendPrivateMsg(long user_id,String message,boolean auto_escape){
        Api api = new Api();
        api.setAction("send_private_msg");
        Param params = new Param();
        SendPrivateMessage sendPrivateMessage = new SendPrivateMessage();
        sendPrivateMessage.setUser_id(user_id);
        sendPrivateMessage.setMessage(message);
        sendPrivateMessage.setAuto_escape(auto_escape);
        params.setSendPrivateMessage(sendPrivateMessage);
        api.setParam(params.getSendPrivateMessage());
        System.out.println(gson.toJson(api));
        return gson.toJson(api);
    }
    public String sendGroupMessage(long group_id,String message,boolean auto_escape){
        Api api = new Api();
        api.setAction("send_group_msg");
        Param params = new Param();
        SendGroupMessage sendGroupMessage = new SendGroupMessage();
        sendGroupMessage.setGroup_id(group_id);
        sendGroupMessage.setMessage(message);
        sendGroupMessage.setAuto_escape(auto_escape);
        params.setSendGroupMessage(sendGroupMessage);
        api.setParam(params.getSendGroupMessage());
        System.out.println(gson.toJson(api));
        return gson.toJson(api);
    }
}
