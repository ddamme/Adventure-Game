package binaryTree;

public class BinaryTree
{
	Node root;
	
	public BinaryTree()
	{
		root = null;
	}
	
	public Node getRoot()
	{
		return this.root;
	}
	
	public void add(int valueIn)
	{
		root = add(root, valueIn);
	}
	
	private Node add(Node current, int newValue)
	{
		
		if (current == null)
		{
			return new Node(newValue);
		}
		
		
		if (current.getValue() <= newValue)
		{
			current.right = add(current.right, newValue);
		}
		else if (current.getValue() > newValue)
		{
			current.left = add(current.left, newValue);
		}
		return current;
	}
	
	
	private int size(Node in)
	{
		if (in == null)
		{
			return 0;
		}
		
		return 1 + size(in.getLeft()) + size(in.getRight());
	}
	
	public int size()
	{
		return size(this.getRoot());
	}
	
	
	
	
}
