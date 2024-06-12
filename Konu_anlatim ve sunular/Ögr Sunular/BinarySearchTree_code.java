import java.util.Scanner;

class Node {
	public int data;
	public Node left, right;
	
	public Node(int newData) {
		data = newData;
		left = null;
		right = null;
	}
}

public class BinarySearchTree {
	static Node root;

	public BinarySearchTree() {
		root = null;
	}

	private boolean search(Node root, int data) {
		if(root == null)
			return false;
		else if(root.data == data)
			return true;
		
		if(data < root.data)
			return search(root.left, data);
		else
			return search(root.right, data);
	}

	private Node insert(Node node, int data) {
		if(node == null)
			node = new Node(data);
		
		else {
			if(data < node.data)
				node.left = insert(node.left, data);
			else
				node.right = insert(node.right, data);
		}
		return node;
	}

	public Node minValueNode(Node node) {
		while(node.left != null)
			node = node.left;
		return node;
	}

	private Node delete(Node root, int data) {
		if(root == null)
			return root;

		if(data < root.data)
			root.left = delete(root.left, data); 
		else if (data > root.data)
			root.right = delete(root.right, data);
		else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			Node temp = minValueNode(root.right);
			root.data = temp.data;
			root.right = delete(root.right, temp.data);
		}
		return root;
	}

	void inOrderTraversal(Node root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.data + " ");
			inOrderTraversal(root.right);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearchTree tree = new BinarySearchTree();
		
		root = tree.insert(root, 38);
		root = tree.insert(root, 61);
		root = tree.insert(root, 75);
		root = tree.insert(root, 4);
		root = tree.insert(root, 9);
		root = tree.insert(root, 52);
		root = tree.insert(root, 2);
		root = tree.insert(root, 87);
		root = tree.insert(root, 14);
		root = tree.insert(root, 68);
		root = tree.insert(root, 7);
		
		System.out.print("Ağaçta sıralı dolaşma: ");
		tree.inOrderTraversal(root);
		System.out.println();
		
		System.out.print("\nAğaçta aramak üzere bir sayı girin: ");
		int element = sc.nextInt();
		System.out.println("Aradığınız değer " + ((tree.search(root, element) == true) ? "bulundu." : "bulunamadı."));
		
		tree.delete(root, 2);
		tree.delete(root, 4);
		tree.delete(root, 38);
		System.out.print("\n2, 4 ve 38 sayıları silindikten sonra ağaçta sıralı dolaşma: ");
		tree.inOrderTraversal(root);
		
		System.out.println();
	}
}
