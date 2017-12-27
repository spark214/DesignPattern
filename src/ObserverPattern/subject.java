package ObserverPattern;

/**
 * Created by ToZ Lam on 2017/10/18.
 */
public interface subject {
    public void registerObserver(observer o);
    public void removeObserver(customer c);
    public void notifyObserver();
}
