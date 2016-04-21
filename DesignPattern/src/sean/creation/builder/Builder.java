package sean.creation.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @title Builder.java
 * @description : Factory method pattern create single instance
 *                Builder pattern create multi-instances
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class Builder {
	
	private List<Sender> senders=new ArrayList<Sender>();
	
	public Builder(){}//constructor
	
	//produce MailSenders
	public List<Sender> produceMailSenders(int count){
		for(int i=0;i<count;i++){
			senders.add(new MailSender());
			System.out.println("producing MailSender...count="+i);
		}
		System.out.println("produce MainSender completed");
		return senders;
	}
	//produce SmsSenders
	public List<Sender> profuceSmsSenders(int count){
		for(int i=0;i<count;i++){
			senders.add(new SmsSender());
			System.out.println("producing SmsSender... count="+i);
		}
		System.out.println("produce SmsSender Completed");
		return senders;
	}


}
