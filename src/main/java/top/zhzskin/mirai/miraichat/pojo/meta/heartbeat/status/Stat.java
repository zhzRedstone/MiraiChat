package top.zhzskin.mirai.miraichat.pojo.meta.heartbeat.status;

public class Stat
{
    private int packet_received;

    private int packet_sent;

    private int packet_lost;

    private int message_received;

    private int message_sent;

    private int disconnect_times;

    private int lost_times;

    private int last_message_time;

    public void setPacket_received(int packet_received){
        this.packet_received = packet_received;
    }
    public int getPacket_received(){
        return this.packet_received;
    }
    public void setPacket_sent(int packet_sent){
        this.packet_sent = packet_sent;
    }
    public int getPacket_sent(){
        return this.packet_sent;
    }
    public void setPacket_lost(int packet_lost){
        this.packet_lost = packet_lost;
    }
    public int getPacket_lost(){
        return this.packet_lost;
    }
    public void setMessage_received(int message_received){
        this.message_received = message_received;
    }
    public int getMessage_received(){
        return this.message_received;
    }
    public void setMessage_sent(int message_sent){
        this.message_sent = message_sent;
    }
    public int getMessage_sent(){
        return this.message_sent;
    }
    public void setDisconnect_times(int disconnect_times){
        this.disconnect_times = disconnect_times;
    }
    public int getDisconnect_times(){
        return this.disconnect_times;
    }
    public void setLost_times(int lost_times){
        this.lost_times = lost_times;
    }
    public int getLost_times(){
        return this.lost_times;
    }
    public void setLast_message_time(int last_message_time){
        this.last_message_time = last_message_time;
    }
    public int getLast_message_time(){
        return this.last_message_time;
    }
}