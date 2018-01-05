package FactoryPattern;

/* 第七步 */
/* 蛤蜊披萨的制作  */
public class clamPizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public clamPizza(PizzaIngredientFactory ingredientFactory){
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
