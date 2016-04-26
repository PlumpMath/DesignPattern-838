package sean.structure.bridge;
/**
 * 
 * @title Bridge.java
 * @description :  ..claims a bridge class to decouple abstraction & implementation
 * @author  Sean
 * @date Apr 26, 2016
 *
 */
public abstract class Bridge {
	
	private Sourceable source;// Sourceable
	
	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}
	
	//method from sourceable
	public void print(){
		source.print();
	}
	
}
