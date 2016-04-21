package sean.creation.factory.method.staticc;

/**
 * 
 * @title StaFacTest.java
 * @description : show result of design based on static factory method pattern
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class StaFacTest {

	public static void main(String[] args) {
		Sender mailsender,smssender;
		
		//produce
		mailsender=SenderFactory.procduceMailSender();
		smssender=SenderFactory.produceSmsSender();
		//send message
		mailsender.send();
		smssender.send();
		

	}

}
