package FacadePattern;

/**
 * Created by Administrator on 2017/11/23.
 */
public class test {
    public static void main(String[] args){
        Amplifier amp=new Amplifier();
        CdPlayer cd=new CdPlayer();
        Projector pjr=new Projector();
        Screen screen=new Screen();
        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade(amp,cd,pjr,screen);
        homeTheaterFacade.watchMovie("Rose");
        System.out.println("----------------------------------");
        homeTheaterFacade.endMovie();
    }
}
