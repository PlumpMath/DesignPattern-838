package sean.structure.adapter.c;
/**
 * 
 * @title  Adapter.java
 * @description  Class Adapter claims to adapt Class Source to Interface Target
 * by extending  Source & implementing Target  
 * @author sean
 * @date  Apr 24, 2016
 */
public class Adapter extends Source implements Target{

	@Override
	public void printAdd() {
		System.out.println("this is a message from Class Adapter");
	}
	

}
