package sean.structure.adapter.o;
/**
 * 
 * @title  AdapterTest.java
 * @description ..shows the result of design based on adapter(object) pattern
 * @author sean
 * @date  Apr 24, 2016
 */
public class AdapterTest {

	public static void main(String[] args) {
		//instantiating source
		Source source=new Source();
		//..
		Target adapter=new Adapter(source);
		//..
		adapter.printSource();
		adapter.printAdd();

	}

}
