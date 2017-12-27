package ObserverPattern;

/**
 * Created by ToZ Lam on 2017/10/18.
 */
public class Test {
    public static void main(String[] args){
        webflower webflower=new webflower();

        customer customer1=new customer("杰瑞","123456","55@66.com");
        customer customer2=new customer("汤姆","123456","77@66.com");

        webflower.registerObserver(customer1);

        webflower.registerObserver(customer2);

        webflower.setFlower("蓝玫瑰",15.88f);

        webflower.removeObserver(customer1);

        webflower.setFlower("太阳花",10.88f);

    }
}
