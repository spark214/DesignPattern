package SimpleFactoryPattern;

public class test {
public static void main(String[] args){
	SimplePizzaFactory s = new SimplePizzaFactory();
	PizzaStore ps=new PizzaStore(s);
	ps.orderPizza("cheese");	
}
}
