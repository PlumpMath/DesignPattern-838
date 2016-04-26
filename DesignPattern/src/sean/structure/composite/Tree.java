package sean.structure.composite;
/**
 * 
 * @title Tree.java
 * @description : ..
 * @author  Sean
 * @date Apr 26, 2016
 *
 */
public class Tree {
	
	private TreeNode root=null;//root of tree-node
	
	//constructor..construct a new tree with root
	public Tree(String name){
		root=new TreeNode(name);
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
}
