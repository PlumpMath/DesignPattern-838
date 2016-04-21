package sean.creation.factory.abstractt;
/**
 * 
 * @title AstFacTest.java
 * @description : show result of design based on abstract factory pattern
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class AstFacTest {

	public static void main(String[] args) {
		SenderFactory msf,ssf;
		Sender ms,ss;
		//init factory
		msf=new MailSenderFactory();
		ssf=new SmsSenderFactory();
		//produce sender
		ms=msf.produce();
		ss=ssf.produce();
		//send message
		ms.send();
		ss.send();
				
		
		

	}

}
