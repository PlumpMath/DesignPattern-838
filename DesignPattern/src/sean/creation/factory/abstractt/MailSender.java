package sean.creation.factory.abstractt;

/**
 * 
 * @title MailSender.java
 * @description : MailSender sends messages by Mail
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class MailSender implements Sender{
	
	public MailSender(){}//constructor
	@Override
	public void send() {
		System.out.println("this message is sent by Mail from MailSender");
	}

}
