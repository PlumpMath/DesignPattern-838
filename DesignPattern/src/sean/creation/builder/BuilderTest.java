package sean.creation.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @title BuilderTest.java
 * @description : show result of design based on Builder Pattern
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class BuilderTest {

	public static void main(String[] args) {
		
		Builder builder=new Builder();
		List<Sender> mailsenders,smssenders;
		mailsenders=builder.produceMailSenders(3);
		smssenders=builder.profuceSmsSenders(2);

	}

}
