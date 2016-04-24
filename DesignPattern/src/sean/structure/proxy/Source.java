package sean.structure.proxy;
/**
 * 
 * @title  Source.java
 * @description claim a source class for target waiting for being proxy-ed
 * method: printSource
 * @author sean
 * @date  Apr 24, 2016
 */
public class Source implements Sourceable{
	
	public Source(){}//constructor
	
	//method printa
	public void printSource(){
		System.out.println("this is a message from Class Source");
	}

}
