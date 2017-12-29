package DecoratorPattern;

/**
 * Created by ToZ Lam on 2017/10/24.
 */
public class HumanSkin extends Skin {
    private String HumanSkin_eating="披着人皮";
    HumanSkin(Wolf wolf){
        this.wolf=wolf;
    }
    public String getEating(){
        return HumanSkin_eating+wolf.getEating();
    }
}
