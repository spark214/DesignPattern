package CommandPattern;

/**
 * Created by Administrator on 2017/11/23.
 */
public class StartonCommand implements Command {
    Player player;
    public StartonCommand(Player player){
        this.player=player;
    }
    public void execute(){
        player.startSong();
    }
}
