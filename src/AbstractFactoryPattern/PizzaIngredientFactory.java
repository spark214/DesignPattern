package AbstractFactoryPattern;

/* 第五步 */
/* 原料工厂制作的接口 */
public interface PizzaIngredientFactory {


	public Dough createDough();

	public Sauce createSauce();

	public Pepperoni createPepperoni();
}
