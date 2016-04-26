package sean.structure.composite;
/**
 * 
 * @title CompositeTest.java
 * @description : ..show result of design based on Composite Pattern
 * @author  Sean
 * @date Apr 26, 2016
 *
 */
public class CompositeTest {

	public static void main(String[] args) {
		
		Tree tree=new Tree("root");
		TreeNode node1=new TreeNode("branch1");
		TreeNode node2=new TreeNode("branch2");
		
		node1.add(node2);// add branch2 to branch1
		tree.getRoot().add(node1);//add branch1 to root
	}

}
