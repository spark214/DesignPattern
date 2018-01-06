package AbstractFactoryPattern;

/* 第六步 */
/* 芝士披萨的制作 */
public class cheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public cheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory ;
		prepare();
	}

	public void prepare() {
		System.out.println("Prepareing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		pepperoni = ingredientFactory.createPepperoni();
	}
}
