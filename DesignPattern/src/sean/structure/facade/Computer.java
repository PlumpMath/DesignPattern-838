package sean.structure.facade;
/**
 * 
 * @title  Computer.java
 * @description ..claims that computer consist of three parts: cpu, memory,disk
 * @author sean
 * @date  Apr 24, 2016
 */
public class Computer {

	private CPU cpu;//part cpu
	private Memory memory;//part memory
	private Disk disk;//part disk
	
	
	/**
	 * @return the cpu
	 */
	public CPU getCpu() {
		return cpu;
	}


	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}


	/**
	 * @return the memory
	 */
	public Memory getMemory() {
		return memory;
	}


	/**
	 * @param memory the memory to set
	 */
	public void setMemory(Memory memory) {
		this.memory = memory;
	}


	/**
	 * @return the disk
	 */
	public Disk getDisk() {
		return disk;
	}


	/**
	 * @param disk the disk to set
	 */
	public void setDisk(Disk disk) {
		this.disk = disk;
	}

	public Computer(CPU cpu,Memory memory,Disk disk){
		this.cpu=cpu;
		this.memory=memory;
		this.disk=disk;
	}//constructor
	
	//computer starts up
	public void startup(){
		System.out.println("computer is starting up=====>");
		cpu.startup();//cpu startup
		memory.startup();//memory startup
		disk.startup();//disk startup
		System.out.println("computer starting completes====");
	}
	//computer shuts down
	public void shutdown(){
		System.out.println("computer is shuting down=====>");
		disk.shutdown();//disk shutdown
		memory.shutdown();//memory shutdown
		cpu.shutdown();//cpu shutdown
		System.out.println("computer shuting completes====");
	}	
}
