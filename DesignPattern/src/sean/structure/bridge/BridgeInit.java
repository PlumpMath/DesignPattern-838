package sean.structure.bridge;
/**
 * 
 * @title BridgeInit.java
 * @description : ..claims class to implement Bridge
 * @author  Sean
 * @date Apr 26, 2016
 *
 */
public class BridgeInit extends Bridge{

	//super constructor
	public BridgeInit(){
		super();
	}
	
	public void print(){
		this.getSource().print();
	}
	
}
