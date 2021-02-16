package top.zhzskin.mirai.miraichat.api;

import top.zhzskin.mirai.miraichat.api.send_group_msg.SendGroupMessage;
import top.zhzskin.mirai.miraichat.api.send_private_msg.SendPrivateMessage;

public class Param {
    SendPrivateMessage sendPrivateMessage;
    SendGroupMessage sendGroupMessage;

    public void setSendPrivateMessage(SendPrivateMessage sendPrivateMessage) {
        this.sendPrivateMessage = sendPrivateMessage;
    }
    public SendPrivateMessage getSendPrivateMessage() {
        return sendPrivateMessage;
    }

    public SendGroupMessage getSendGroupMessage() {
        return sendGroupMessage;
    }
    public void setSendGroupMessage(SendGroupMessage sendGroupMessage) {
        this.sendGroupMessage = sendGroupMessage;
    }
}
