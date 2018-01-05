package FactoryPattern;

/* 第十二步 */
/* 测试类 */
public class test {
	public static void main(String[] args) {
		PizzaStore nyPizza = new NYPizzaStore();
		nyPizza.orderPizza("cheese");
	}
}
