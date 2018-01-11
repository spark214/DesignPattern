package FacadePattern;

/**
 * Created by Administrator on 2017/11/23.
 */
public class CdPlayer {

    public void on(){
        System.out.println("播放器开启");
    }
    public void close(){
        System.out.println("播放器关闭");
    }
    public void play(String movie){
        System.out.println("正在播放电影："+movie);
    }

}
