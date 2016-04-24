package sean.structure.proxy;
/**
 * 
 * @title  ProxyTest.java
 * @description show result of design based on proxy pattern
 * @author sean
 * @date  Apr 24, 2016
 */

public class ProxyTest {

	public static void main(String[] args) {
		
		Sourceable proxy=new Proxy();
		//diff with Decorator
		//without knowing any details of Proxy
		proxy.printSource();

	}

}
