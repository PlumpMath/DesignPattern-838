package sean.structure.decorator;
/**
 * 
 * @title  Decorator.java
 * @description ..claims to decorate Source, implements Sourceable
 * 
 * diff between Proxy & Decorator
 * Proxy  object is created in constructor in  unclaimed-status way.
 * Decorator object is created in implicit way.
 * 
 * diff between Adapter(Object) and Decorator
 *  Adapter: interface extent function of source class
 *  Decorator: same interface with source 
 * @author sean
 * @date  Apr 24, 2016
 */
public class Decorator implements Sourceable{

	private Sourceable source;
	
	public Decorator(Sourceable source){this.source=source;}//constructor
	
	@Override
	public void printSource() {
		System.out.println("======before source=======");
		source.printSource();
		System.out.println("======after Source========");
		
	}

}
