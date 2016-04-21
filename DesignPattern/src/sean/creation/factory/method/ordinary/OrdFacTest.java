package sean.creation.factory.method.ordinary;
/**
 * 
 * @title OrdFacTest.java
 * @description : show the result of design based on ordinary factory method pattern
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class OrdFacTest {

	public static void main(String[] args) {
		
		SenderFactory sf=new SenderFactory();
		
		Sender mailsender=sf.produceSenderByType("mail");
		Sender smssender=sf.produceSenderByType("sms");
		mailsender.send();
		smssender.send();
		Sender nonsender=sf.produceSenderByType("nontype");
		nonsender.send();

	}

}
