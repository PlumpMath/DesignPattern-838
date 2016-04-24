package sean.structure.proxy;
/**
 * 
 * @title  Proxy.java
 * @description ..claims proxy class of Source
 * diff between Proxy & Decorator
 * Proxy,  object is created in constructor in  unclaimed-status way.
 * Decorator, object is created in implicit way.
 * @author sean
 * @date  Apr 24, 2016
 */
public class Proxy  implements Sourceable{
	
	private Sourceable source;

	//constructor
	public Proxy(){
		source=new Source();//diff
	}
	@Override
	public void printSource() {
		this.printBefore();
		source.printSource();
		this.printAfter();
	}
	
	private void printBefore(){
		System.out.println("before print Source====");
	}
	private void printAfter(){
		System.out.println("after print Source===");
	}

}
