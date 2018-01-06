package AbstractFactoryPattern;

/* 第四步 */
/* 披萨超类 */
public abstract class Pizza {
	String name ;
	Dough dough ;
	Sauce sauce ;
	Pepperoni pepperoni ;
	
	/* 原料的准备都放入prepare()中 所以抽象化该函数 */
	public abstract void prepare();
	
	public void bake(){
		System.out.print("烘焙->");
	}
	
	public void cut(){
		System.out.print("切块->");
	}
	
	public void box(){
		System.out.println("包装完成");
	}
	
	public void setName(String name){
		this.name = name ;
	}
}
