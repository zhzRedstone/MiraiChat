package top.zhzskin.mirai.miraichat;

import com.google.gson.Gson;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;
import top.zhzskin.mirai.miraichat.api.ApiBuilder;
import top.zhzskin.mirai.miraichat.client.WsClient;

import java.net.URISyntaxException;


public class MiraiChat extends JavaPlugin implements Listener {
    //全局实例化
    WsClient wsClient;
    Gson gson = new Gson();

    @Override
    public void onLoad() {
        try {
            this.wsClient = new WsClient("ws://101.200.194.251:6700");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onEnable() {
        wsClient.connect();
        if (this.wsClient.isOpen()){
            getLogger().info("WebSocket已连接");
        }
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        wsClient.send(new ApiBuilder().sendGroupMessage(330986863,event.getMessage(),false));
        // todo wsClient.send("json"); 需实现API
    }

    @Override
    public void onDisable() {
        wsClient.close();
    }
}
