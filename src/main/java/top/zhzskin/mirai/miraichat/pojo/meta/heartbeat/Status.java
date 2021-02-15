package top.zhzskin.mirai.miraichat.pojo.meta.heartbeat;

import top.zhzskin.mirai.miraichat.pojo.meta.heartbeat.status.Stat;

public class Status
{
    private boolean app_enabled;

    private boolean app_good;

    private boolean app_initialized;

    private boolean good;

    private boolean online;

    private String plugins_good;

    private Stat stat;

    public void setApp_enabled(boolean app_enabled){
        this.app_enabled = app_enabled;
    }
    public boolean getApp_enabled(){
        return this.app_enabled;
    }
    public void setApp_good(boolean app_good){
        this.app_good = app_good;
    }
    public boolean getApp_good(){
        return this.app_good;
    }
    public void setApp_initialized(boolean app_initialized){
        this.app_initialized = app_initialized;
    }
    public boolean getApp_initialized(){
        return this.app_initialized;
    }
    public void setGood(boolean good){
        this.good = good;
    }
    public boolean getGood(){
        return this.good;
    }
    public void setOnline(boolean online){
        this.online = online;
    }
    public boolean getOnline(){
        return this.online;
    }
    public void setPlugins_good(String plugins_good){
        this.plugins_good = plugins_good;
    }
    public String getPlugins_good(){
        return this.plugins_good;
    }
    public void setStat(Stat stat){
        this.stat = stat;
    }
    public Stat getStat(){
        return this.stat;
    }
}
