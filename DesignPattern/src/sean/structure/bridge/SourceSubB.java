package sean.structure.bridge;
/**
 * 
 * @title SourceSubB.java
 * @description : ..claims another class implementing interface Sourceable
 * @author  Sean
 * @date Apr 26, 2016
 *
 */
public class SourceSubB implements Sourceable{

	public SourceSubB(){}//constructor
	
	//implement method
	@Override
	public void print() {
		System.out.println("this message is generated  from SourceSubB");		
	}

}
