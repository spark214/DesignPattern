package CommandPattern;

/**
 * Created by Administrator on 2017/11/23.
 */
public class NextonCommand implements Command {
    Player player;
    public NextonCommand(Player player){
        this.player=player;
    }
    public void execute(){
        player.nextSong();
    }
}
