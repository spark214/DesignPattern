package DecoratorPattern;

/**
 * Created by ToZ Lam on 2017/10/25.
 */
public class Test {
    public static void main(String args[]){
        Wolf wolf1=new NakedWolf();
        wolf1=new RabbitSkin(wolf1);
        System.out.println(wolf1.getEating());

        Wolf wolf2=new NakedWolf();
        wolf2=new HumanSkin(wolf2);
        System.out.println(wolf2.getEating());

        Wolf wolf3=new NakedWolf();
        wolf3=new SheepSkin(wolf3);
        System.out.println(wolf3.getEating());
    }
}
