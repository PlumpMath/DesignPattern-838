package sean.behavior.strategy;
/**
 * 
 * @title Context.java
 * @description : Context maintains citation of Strategy
 * @author  Sean
 * @date May 31, 2016
 *
 */
public class Context {
	
	private Strategy strategy;
	
	//constructor
	public Context(Strategy strategy){
		this.strategy=strategy;
	}
	
	// call algorithm
	public void callAlgorithm(){
		strategy.algorithm();
	}
	

}
