package CommandPattern;

/**
 * Created by Administrator on 2017/11/23.
 */
public class Player {
    public void lastSong(){
        System.out.println("播放上一首");
    }
    public void nextSong(){
        System.out.println("播放下一首");
    }
    public void pauseSong(){
        System.out.println("暂停播放");
    }
    public void startSong(){
        System.out.println("开始播放");
    }
}
