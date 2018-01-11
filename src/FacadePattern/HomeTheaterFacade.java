package FacadePattern;

/**
 * Created by Administrator on 2017/11/23.
 */
public class HomeTheaterFacade {
    Amplifier amp;//扬声器
    CdPlayer cd;
    Projector pjr;//投影仪
    Screen screen;

    public HomeTheaterFacade( Amplifier amp,
            CdPlayer cd,
            Projector pjr,
            Screen screen){
        this.amp=amp;
        this.cd=cd;
        this.pjr=pjr;
        this.screen=screen;
    }

    public void  watchMovie(String movie){
        amp.on();
        cd.on();
        pjr.on();
        screen.on();
        System.out.println("已准备好播放电影！");
        cd.play(movie);
    }
    public void  endMovie(){
        amp.close();
        cd.close();
        pjr.close();
        screen.close();
        System.out.println("已关闭家庭影院！");

    }
}
