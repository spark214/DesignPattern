package AbstractFactoryPattern;

/* 第十步 */
/* 抽象披萨工厂  */
public abstract class PizzaStore {
	public Pizza orderPizza(String tp){
		Pizza MyPizza ;
		MyPizza = createPizza(tp);
		
		MyPizza.prepare();
		MyPizza.bake();
		MyPizza.cut();
		MyPizza.box();
		
		return MyPizza ;
	}
	
	public abstract Pizza createPizza(String tp);
}
