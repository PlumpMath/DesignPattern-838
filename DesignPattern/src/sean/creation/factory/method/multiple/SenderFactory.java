package sean.creation.factory.method.multiple;
/**
 * 
 * @title SenderFactory.java
 * @description :SenderFactory creates Senders of different kinds
 *               by different method
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class SenderFactory {
	
	public SenderFactory(){}//constructor
	

	//new MailSender
	public Sender produceMailSender(){
		return new MailSender();
	}
	
	// new SmsSener
	public Sender produceSmsSender(){
		return new SmsSender();
	}

}
