package sean.structure.flyweight;
/**
 * 
 * @title ConcreteFlyweight.java
 * @description : ConcreteFlyweight which implements Interface Flyweight shares memory space, 
 * @author  Sean
 * @date May 31, 2016
 *
 */
public class ConcreteFlyweight implements Flyweight{

	@Override
	public void operate(String key) {
		
		System.out.println("this is a shared Flyweight: "+key);
	}

}
