package sean.structure.flyweight;
/**
 * 
 * @title UnsharedFlyweight.java
 * @description :UnsharedFlyweight which implements Interface Flyweight doesn't share memroy with others
 * @author  Sean
 * @date May 31, 2016
 *
 */
public class UnsharedFlyweight implements Flyweight{

	@Override
	public void operate(String key) {
		System.out.println("this is an unshared Flyweight: "+key);
		
	}

}
