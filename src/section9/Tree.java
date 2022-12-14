package section9;

public class Tree {

	private TreeNode root;
	
	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
		} else {
			root.insert(value);
		}
	}
	
	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();
		}
	}
	
	public TreeNode get(int value) {
		if (root != null) {
			return root.get(value);
		}
		
		return null;
	}
	
	public int min() {
		if (root == null) {
			return Integer.MIN_VALUE;
		} else {
			return root.min();
		}
	}
	
	public int max() {
		if (root == null) {
			return Integer.MAX_VALUE;
		} else {
			return root.max();
		}
	}
	
	public void delete(int value) {
		root = delete(root, value);
	}
	
	private TreeNode delete(TreeNode subTreeRoot, int value) {
		if (subTreeRoot == null) {
			return subTreeRoot;
		}
		
		if (value < subTreeRoot.getData()) {
			subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
		} else if (value < subTreeRoot.getData()) {
			subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
		} else {
			
			/** Case 1 and 2: node to delete has 0 or 1 child  **/
			if (subTreeRoot.getLeftChild() == null) {
				return subTreeRoot.getRightChild();
			} else if (subTreeRoot.getRightChild() == null) {
				return subTreeRoot.getLeftChild();
			}
		}
		
		/** End Case 1 and 2 **/
		
		/** Case 3: node to delete has 2 children **/
		
		// Replace the value in the subTreeRoot node with the smallest value from the right subtree
		subTreeRoot.setData(subTreeRoot.getRightChild().min());
		// Delete the node that has the smalless value in the right subTree
		subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
		
		/** End case 3 **/
		
		return subTreeRoot;
		
		
	}
}
