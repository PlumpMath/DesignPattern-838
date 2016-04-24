package sean.structure.adapter.i;
/**
 * 
 * @title  AdaperTest.java
 * @description  ..shows result of design based on adapter(interface) patter
 * @author sean
 * @date  Apr 24, 2016
 */
public class AdaperTest {

	public static void main(String args[]){
		Target a1=new SubSourceA();
		a1.printA();
		
		Target b1=new SubSourceB();
		b1.printB();
		
	}
}
