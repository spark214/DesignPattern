package ObserverPattern;

/**
 * Created by ToZ Lam on 2017/10/18.
 */
public interface observer {
    public void update(String flowerName, float flowerPrice);
    public void welcome();
    public void remove();
}
