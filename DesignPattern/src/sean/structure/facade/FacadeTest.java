package sean.structure.facade;
/**
 * 
 * @title  FacadeTest.java
 * @description .. shows result of design based on facade pattern
 * @author sean
 * @date  Apr 24, 2016
 */
public class FacadeTest {

	public static void main(String[] args) {
		
		CPU cpu=new CPU();
		Memory memory=new Memory();
		Disk disk=new Disk();
		
		Computer computer=new Computer(cpu,memory,disk);
		
		//start up
		computer.startup();
		computer.shutdown();

	}

}
