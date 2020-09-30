package binaryTree;

public class Node
{
	int value;
	Node left;
	Node right;
	
	public Node(int valueIn)
	{
		this.value = valueIn;
		this.left = null;
		this.right = null;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public Node getLeft()
	{
		return this.left;
	}
	
	public Node getRight()
	{
		return this.right;
	}
}
