package sean.creation.factory.abstractt;
/**
 * 
 * @title SmsSenderFactory.java
 * @description : produce SmsSenderFactory
 * 				  implements SenderFactory
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class SmsSenderFactory implements SenderFactory{

	@Override
	public Sender produce() {
		return new SmsSender();
	}



}
