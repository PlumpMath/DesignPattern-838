package sean.structure.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 
 * @title TreeNode.java
 * @description : ..
 * @author  Sean
 * @date Apr 26, 2016
 *
 */
public class TreeNode {
	
	private String name;//node name
	private TreeNode parent;//parent node
	private Vector<TreeNode> children;//children node
	
	//constructor
	public TreeNode(String name){
		this.name=name;
	}
	
	//add children node
	public void add(TreeNode treenode){
		children.add(treenode);
	}
	
	//remove children node
	public void remove(TreeNode treenode){
		children.remove(treenode);
	}
	
	//get node of children
	public Enumeration<TreeNode> getChilren(){
		return children.elements();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

}
