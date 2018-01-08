package CommandPattern;

/**
 * Created by Administrator on 2017/11/23.
 */
public class LastonCommand implements Command {
    Player player;
    public LastonCommand(Player player){
        this.player=player;
    }
    public void execute(){
        player.lastSong();
    }
}
