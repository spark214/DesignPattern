package FactoryPattern;

/* 第八步 */
/* 素食披萨的制作  */
public class veggiePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public veggiePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory ;
		prepare();
	}

	public void prepare() {
       System.out.print("Prepareing " + name);
       dough = ingredientFactory.createDough();
       sauce = ingredientFactory.createSauce();
       pepperoni = ingredientFactory.createPepperoni();
	}
}
