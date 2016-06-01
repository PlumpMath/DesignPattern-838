package sean.behavior.template;
/**
 * 
 * @title Beverage.java
 * @description : abstract class 
 * @author  Sean
 * @date Jun 1, 2016
 *
 */
public abstract class Beverage {

	//create
	public  final void create(){
		boilWater();
		brew();
		pourInCup();
		addCoundiments();
	}
	
	//abstract addCoundiments
	public abstract void addCoundiments();
	//abstract brew
	public abstract void brew();
	//boil water
	public void boilWater(){
		System.out.println("boil water....");
	}
	//pourInCup
	public void pourInCup(){
		System.out.println("purr in cup ....");
	}
}
