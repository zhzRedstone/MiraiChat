package top.zhzskin.mirai.miraichat;

import com.google.gson.Gson;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;
import top.zhzskin.mirai.miraichat.api.ApiBuilder;
import top.zhzskin.mirai.miraichat.client.WsClient;
import top.zhzskin.mirai.miraichat.msghandle.MessageHandler;

import java.net.URISyntaxException;

public class MiraiChat extends JavaPlugin implements Listener {
    //全局实例化
    WsClient wsClient;
    Gson gson = new Gson();
    FileConfiguration config = getConfig();
    @Override
    public void onLoad() {
        saveDefaultConfig();
        MessageHandler.setGroup(config.getLong("group"));
        try {
            this.wsClient = new WsClient(config.getString("WsUrl"));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        wsClient.connect();
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        wsClient.send(new ApiBuilder().sendGroupMessage(config.getLong("group"),event.getMessage(),false));
        // todo wsClient.send("json"); 需实现API
    }

    @Override
    public void onDisable() {
        wsClient.close();
    }
}
