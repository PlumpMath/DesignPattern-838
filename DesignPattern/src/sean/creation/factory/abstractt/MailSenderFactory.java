package sean.creation.factory.abstractt;
/**
 * 
 * @title MailSenderFactory.java
 * @description :produce MailSender 
 *               implement interface SenderFactory
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class MailSenderFactory implements SenderFactory{

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
