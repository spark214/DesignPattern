package CommandPattern;

/**
 * Created by Administrator on 2017/11/23.
 */
public class test {
    public static void main(String[] args) {
        Control control = new Control();
        Player player = new Player();
        LastonCommand laston = new LastonCommand(player);
        NextonCommand nexton=new NextonCommand(player);
        PauseonCommand pauseon=new PauseonCommand(player);
        StartonCommand starton=new StartonCommand(player);

        control.setCommand(laston);
        control.buttonWasPressed();

        control.setCommand(nexton);
        control.buttonWasPressed();

        control.setCommand(pauseon);
        control.buttonWasPressed();

        control.setCommand(starton);
        control.buttonWasPressed();
    }
}
