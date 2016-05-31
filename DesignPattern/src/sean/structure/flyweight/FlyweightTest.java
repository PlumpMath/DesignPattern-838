package sean.structure.flyweight;
/**
 * 
 * @title FlyweightTest.java
 * @description : Test class
 * @author  Sean
 * @date May 31, 2016
 *
 */
public class FlyweightTest {

	public static void main(String[] args) {
		FlyweightFactory ff=new FlyweightFactory();
		//shard-Flyweight 
		Flyweight f1=ff.getFlyweightByKey("x");
		f1.operate("x");
		Flyweight f2=ff.getFlyweightByKey("y");
		f2.operate("y");
		Flyweight f3=ff.getFlyweightByKey("z");
		f3.operate("z");
		//unshared-Flyweight
		Flyweight f4=new UnsharedFlyweight();
		f4.operate("unshared");

	}

}
