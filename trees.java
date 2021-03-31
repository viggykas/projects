
public class trees {
	

public class Node {

	    int value;
	    Node left;
	    Node right;

	    Node(int value) {
	        this.value = value;
	        right = null;
	        left = null;
	    }
	
	
}

 static Node root;


Node SortArray (int arr[], int start, int end ) {
	
	if (start > end) {
		return null;
	}
	
	int mid = (start + end) / 2;
	
	Node node = new Node(arr[mid]);
	
	node.left = SortArray(arr, start, mid - 1);
	node.right = SortArray (arr, mid + 1, end);
	
	return node;
	
	
}

void preOrder(Node node) {
	
	if (node == null) {
		
		return;
	}
	
	System.out.print(node.value + " ");
	preOrder(node.left);
	preOrder(node.right);

}

void inOrder(Node node) {
	
	if (node == null) {
		
		return;
	}
	
	
	inOrder(node.left);
	System.out.print(node.value + " ");
	inOrder(node.right);

}
	
void postOrder(Node node) {
	
	if (node == null) {
		
		return;
	}
	
	
	postOrder(node.left);
	postOrder(node.right);
	System.out.print(node.value + " ");

}
	

	public static void main(String[] args) {

	
		trees tree = new trees();
		
		int arr [] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int len = arr.length;
		
		root = tree.SortArray(arr, 0, len-1);
		
		
		//preorder
		System.out.println("Preorder Traversal: ");
		tree.preOrder(root);
		System.out.println("\n");
		
		//inorder
		System.out.println("Inorder Traversal: ");
		tree.inOrder(root);
		System.out.println("\n");		
		
		//postorder
		System.out.println("Postorder Traversal: ");
		tree.postOrder(root);
		System.out.println("\n");		
		
	}

}
