package sean.structure.adapter.o;
/**
 * 
 * @title  Adapter.java
 * @description  Class Adapter claims to adapt Class Source to Interface Target
 * by implementing Target & instantiating Source  
 * @author sean
 * @date  Apr 24, 2016
 *  diff between Adapter(Object) and Decorator
 *  Adapter: interface extent function of source class
 *  Decorator: same interface with source
 */
public class Adapter implements Target{

	private Source source;
	
	public Adapter(Source source){this.source=source;}//constructor
	
	@Override
	public void printAdd() {
		System.out.println("this is a message from Class Adapter");
	}

	//method from instance source
	@Override
	public void printSource() {
		source.printSource();
	}
	

}
