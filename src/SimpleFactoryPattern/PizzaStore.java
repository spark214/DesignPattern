package SimpleFactoryPattern;

public class PizzaStore {
	SimplePizzaFactory s ;

	public PizzaStore(SimplePizzaFactory s){
		this.s = s ;
	}
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza=s.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
