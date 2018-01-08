package CommandPattern;

/**
 * Created by Administrator on 2017/11/23.
 */
public class Control {
    Command command;
    public void setCommand(Command command){
        this.command=command;
    }
    public void buttonWasPressed(){
        command.execute();
    }
}
