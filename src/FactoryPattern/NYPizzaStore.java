package FactoryPattern;

/* 第十一步 */
/* 纽约工厂的制造 */
public class NYPizzaStore extends PizzaStore{
	public Pizza createPizza(String tp){
		Pizza MyPizza = null ;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if("cheese".equals(tp)){
			MyPizza = new cheesePizza(ingredientFactory);
			MyPizza.setName("纽约芝士披萨");
		}
		else if("clam".equals(tp)){
	    	MyPizza = new clamPizza(ingredientFactory);
	    	MyPizza.setName("纽约蛤蜊披萨");
		}

		else if("veggie".equals(tp)){
			MyPizza = new veggiePizza(ingredientFactory);
			MyPizza.setName("纽约素食披萨");
	    }
	     
		return MyPizza ;
	}
}
