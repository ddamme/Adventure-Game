package binaryTree;

public class main 
{
	public static void main(String[] args)
	{
		BinaryTree x = new BinaryTree();
		
		System.out.println(x.size());
		x.add(10);
		System.out.println(x.size());
		x.add(20);
		System.out.println(x.size());
		x.add(5);
		System.out.println(x.size());
		
		//System.out.println(x.getRoot().getValue());
		//System.out.println(x.getRoot().getLeft().getValue());
		//System.out.println(x.getRoot().getRight().getValue());
		
		
	}
}
