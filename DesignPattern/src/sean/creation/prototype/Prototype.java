package sean.creation.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @title Prototype.java
 * @description : main function: clone an object and its variables(object)
 * @author  Sean
 * @date Apr 21, 2016
 *
 */
public class Prototype implements Cloneable{
	
	private String string;//string
	
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public Prototype(){}//constructor
	
	//clone prototype only
	public Object clone() throws CloneNotSupportedException{
		Prototype prototype=(Prototype)super.clone();
		return prototype;
	}
	
	//clone prototype  and its object
	public Object deepClone() throws IOException, ClassNotFoundException{
		
		//write object to byte array
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		//read object from byte array format
		ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		
		return ois.readObject();
		
	}

}
