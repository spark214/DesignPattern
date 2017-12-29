package DecoratorPattern;

/**
 * Created by ToZ Lam on 2017/10/24.
 */
public class SheepSkin extends Skin {
    private String SheepSkin_eating="披着羊皮";
    SheepSkin(Wolf wolf){
        this.wolf=wolf;
    }
    public String getEating(){
        return SheepSkin_eating+wolf.getEating();
    }
}
