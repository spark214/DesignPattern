package ObserverPattern;

/**
 * Created by ToZ Lam on 2017/10/18.
 */
public class customer implements observer {
    private String userName;
    private String password;
    private String userEmail;
    private subject customer;
    customer(String userName,String password,String userEmail){
        this.userName=userName;
        this.password=password;
        this.userEmail=userEmail;
    }
    public void welcome(){
        System.out.println("注册成功，"+userName);
    }

    public void update(String flowerName,float flowerPrice){
        System.out.println(userName+",本店新进货"+flowerName+"，售价："+flowerPrice+"元");
    }

    public void remove(){
        System.out.println(userName+",您已成功取消订阅");
    }
}
