package sean.structure.bridge;
/**
 * 
 * @title BridgeTest.java
 * @description : ..shows the result of design based on Bridge pattern
 * @author  Sean
 * @date Apr 26, 2016
 *
 */
public class BridgeTest {

	public static void main(String[] args) {
		Sourceable source1=new SourceSubA();//SourceSubA
		Sourceable source2=new SourceSubB();//SourceSubB
		
		Bridge bridge=new BridgeInit();
		
		bridge.setSource(source1);//set SourceSubA
		bridge.print();
		
		bridge.setSource(source2);//set SourceSubB
		bridge.print();

	}

}
