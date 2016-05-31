package sean.structure.flyweight;

import java.util.Hashtable;

/**
 * 
 * @title FlyweightFactory.java
 * @description : FlyweightFactory creates shared Flyweights(ConcreteFlyweight) 
 * @author  Sean
 * @date May 31, 2016
 *
 */
public class FlyweightFactory {
	
	private Hashtable<String,Flyweight> shared_flyweights=new Hashtable<String,Flyweight>();
	
	//constructor
	public FlyweightFactory(){
		shared_flyweights.put("x", new ConcreteFlyweight());
		shared_flyweights.put("y", new ConcreteFlyweight());
		shared_flyweights.put("z", new ConcreteFlyweight());
	}
	//get flyweight by key
	public Flyweight getFlyweightByKey(String key){
		return shared_flyweights.get(key);
	}
	
}
