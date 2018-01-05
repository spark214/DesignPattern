package FactoryPattern;

/* 第九步 */
/* 具体原料工厂向纽约工厂制造的原料 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
	public Dough createDough(){
		return new Dough();
}

	public Sauce createSauce(){
		return new Sauce();
	}
	
	public Pepperoni createPepperoni(){
		return new Pepperoni();
	}

}
