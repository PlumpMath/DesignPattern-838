package sean.structure.decorator;
/**
 * 
 * @title  DecoratorTest.java
 * @description ..shows result of design based on decorator pattern
 * @author sean
 * @date  Apr 24, 2016
 * 
 * diff between Adapter(Object) and Decorator
 *  Adapter: interface extent function of source class
 *  Decorator: same interface with source
 * 
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Sourceable source=new Source();
		Sourceable decorator=new Decorator(source);
		
		decorator.printSource();

	}

}
