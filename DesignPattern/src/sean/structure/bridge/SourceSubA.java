package sean.structure.bridge;
/**
 * 
 * @title SourceSubA.java
 * @description : ..claims a class implementing interface Sourceable
 * @author  Sean
 * @date Apr 26, 2016
 *
 */
public class SourceSubA implements Sourceable{

	public SourceSubA(){}//constructor
	
	//implement method
	@Override
	public void print() {
		System.out.println("this message is generated from SourceSubA");
	}

}
