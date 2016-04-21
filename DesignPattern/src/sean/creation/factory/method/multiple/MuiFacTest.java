package sean.creation.factory.method.multiple;
/**
 * 
 * @title MuiFacTest.java
 * @description : show result of design based on multiple factory method pattern
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class MuiFacTest {

	public static void main(String[] args) {
		
		//initialize  factory
		SenderFactory sf=new SenderFactory();
		
		//produce instance
		Sender mailsender=sf.produceMailSender();
		Sender smssender=sf.produceSmsSender();
		
		//send message
		mailsender.send();
		smssender.send();

	}

}
