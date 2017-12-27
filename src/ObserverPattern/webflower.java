package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ToZ Lam on 2017/10/18.
 */
public class webflower implements subject {
    private String flowerName;
    private float flowerPrice;

     private ArrayList customersList=new ArrayList();

    public void registerObserver(observer o){
        customersList.add(o);
        o.welcome();
    }
    public void removeObserver(customer c){
        int i=customersList.indexOf(c);
        if(i>=0){
            customersList.remove(i);
        }
        c.remove();
    }
    public void flowersChange(){
        notifyObserver();
    }

    public void notifyObserver(){
        for(int i=0;i<customersList.size();i++){
            customer customer=(customer)customersList.get(i);
            customer.update(flowerName,flowerPrice);
        }

    }

    public void setFlower(String flowerName,float flowerPrice){
            this.flowerName=flowerName;
            this.flowerPrice=flowerPrice;
            flowersChange();
    }
}
