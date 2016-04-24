package sean.structure.adapter.c;
/**
 * 
 * @title  AdapterTest.java
 * @description show the result of design based on adapter(class) pattern
 * @author sean
 * @date  Apr 24, 2016
 */
public class AdapterTest {

	public static void main(String[] args) {
		
		//initialize an instance of Adapter
		Target adapter=new Adapter();
		
		//method from Source
		adapter.printSource();
		//method from Adapter
		adapter.printAdd();

	}

}
