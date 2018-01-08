package CommandPattern;

/**
 * Created by Administrator on 2017/11/23.
 */
public class PauseonCommand implements Command {
    Player player;
    public PauseonCommand(Player player){
        this.player=player;
    }
    public void execute(){
        player.pauseSong();
    }
}
