package sean.creation.factory.method.ordinary;
/**
 * 
 * @title SenderFactory.java
 * @description :SenderFactory creates Senders of different kinds
 *               judging on @param message type
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class SenderFactory {
	
	public SenderFactory(){}//constructor
	
	/**
	 * @param message_type
	 * @return Sender 
	 */
	public Sender produceSenderByType(String message_type){
		Sender sender=null;
		/**
		 * message_type=mail
		 * produce MailSender
		 */
		if (message_type.equals("mail")){
			sender= new MailSender();}
		/**
		 * message_type=sms
		 * produce SmsSender
		 */
		else if(message_type.equals("sms")){
			sender= new SmsSender();}
		/**
		 * message_type<> (mail&&sms)
		 * throw exception
		 */
		else
			try { 
				throw new Exception("message type wrong!!!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		return sender;		
	}

}
