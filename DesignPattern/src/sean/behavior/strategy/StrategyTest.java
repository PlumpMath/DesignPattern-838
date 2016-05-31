package sean.behavior.strategy;
/**
 * 
 * @title StrategyTest.java
 * @description :  Test
 * @author  Sean
 * @date May 31, 2016
 *
 */
public class StrategyTest {

	public static void main(String[] args) {
		
		//new strategy
		Strategy s1,s2,s3;
		s1=new StrategyA();
		s2=new StrategyB();
		s3=new StrategyC();
		
		//set strategy
		Context c1,c2,c3;
		c1=new Context(s1);
		c2=new Context(s2);
		c3=new Context(s3);
		//call algorithm
		c1.callAlgorithm();
		c2.callAlgorithm();
		c3.callAlgorithm();
		

	}

}
