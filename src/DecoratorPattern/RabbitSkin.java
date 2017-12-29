package DecoratorPattern;

/**
 * Created by ToZ Lam on 2017/10/24.
 */
public class RabbitSkin extends Skin {
    private String RabbitSkin_eating="披着兔子皮";
    RabbitSkin(Wolf wolf){
        this.wolf=wolf;
    }
    public String getEating(){
        return RabbitSkin_eating+wolf.getEating();
    }
}
