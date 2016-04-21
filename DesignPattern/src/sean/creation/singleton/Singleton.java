package sean.creation.singleton;
/**
 * 
 * @title Singleton.java
 * @description : Singleton Pattern ensure that there is only one instance in JVM
 *    benefit-->Creating class frequently increases cost of server-system
 *           -->Decrease the pressure of GC 
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class Singleton {
	
	private static Singleton instance;
	
	private Singleton(){}//make constructor private
	
	//create instance
	public static Singleton getInstance(){
	
		if(instance==null){
			synchronized(instance){
			instance=new Singleton();
			}
		}
			return instance;
	}

}
