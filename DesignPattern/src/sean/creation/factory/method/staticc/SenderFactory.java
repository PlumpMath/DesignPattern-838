package sean.creation.factory.method.staticc;
/**
 * 
 * @title SenderFactory.java
 * @description :SenderFactory creates Senders of different kinds
 *               by different static method
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class SenderFactory {
	
	//produce MailSender
	public static Sender procduceMailSender(){
		return new MailSender();
	}
	
	//produce SmsSender
	public static Sender produceSmsSender(){
		return new SmsSender();
	}
}
