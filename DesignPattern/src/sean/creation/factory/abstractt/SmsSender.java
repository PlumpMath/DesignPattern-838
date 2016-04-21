package sean.creation.factory.abstractt;
/**
 * 
 * @title SmsSender.java
 * @description :SmsSender sends messages by phone.
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class SmsSender implements Sender{

	public SmsSender(){}//constructor
	@Override
	public void send() {
		System.out.println("this message is sent by phone from SmsSender.");
	}

}
