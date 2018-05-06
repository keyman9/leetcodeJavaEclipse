package invertBinTree;

import static org.junit.Assert.assertTrue;

public class InvertBinaryTree {
	/*
	 * Description:
	 * Invert a Binary Tree
	 * 
	 * 		4				  4
	 * 	  /   \             /   \
	 *   2     7   --->    7     2
	 *	/ \   / \         / \   / \
	 * 1   3 6   9       9   6 3   1
	 */
	

	public static void main(String[] args) {
		
		//Create input tree nodes
		TreeNode in_root = new TreeNode(4);
		TreeNode in_l = new TreeNode(2);
		TreeNode in_r = new TreeNode(7);
		TreeNode in_ll = new TreeNode(1);
		TreeNode in_lr = new TreeNode(3);
		TreeNode in_rl = new TreeNode(6);
		TreeNode in_rr = new TreeNode(9);
		//Build input tree
		in_root.left = in_l;
		in_root.right = in_r;
		in_l.left = in_ll;
		in_l.right = in_lr;
		in_r.left = in_rl;
		in_r.right = in_rr;
		
		//Created expected output tree nodes
		TreeNode t1_root = new TreeNode(4);
		TreeNode t1_l = new TreeNode(7);
		TreeNode t1_r = new TreeNode(2);
		TreeNode t1_ll = new TreeNode(9);
		TreeNode t1_lr = new TreeNode(6);
		TreeNode t1_rl = new TreeNode(3);
		TreeNode t1_rr = new TreeNode(1);
		//Build expected output tree nodes
		t1_root.left = t1_l;
		t1_root.right = t1_r;
		t1_l.left = t1_ll;
		t1_l.right = t1_lr;
		t1_r.left = t1_rl;
		t1_r.right = t1_rr;
		
		TreeNode inverted = invertTree(in_root);
		
		assertTrue(identicalTrees(inverted,t1_root));

	}
	
	public static boolean identicalTrees(TreeNode t1, TreeNode t2) {
		boolean sameValues = true;
		if(t1 == null && t2 != null) {
			sameValues = false;
		}
		if(t2 == null && t1 != null) {
			sameValues = false;
		}
		if(t1 != null && t2 != null && t1.val != t2.val) {
			sameValues = false;
		}
		if(t1 != null && t2 != null && t1.val == t2.val) {
			boolean left = identicalTrees(t1.left,t2.left);
			boolean right = identicalTrees(t1.right,t2.right);
			if(!left || !right) {
				sameValues = false;
			}
		}
		
		return sameValues;
	}
	
	public static TreeNode invertTree(TreeNode root) {
		//if the root does not exit, just return it
		if(root == null) {
			return root;
		}
		
		//temp values for retaining children
		TreeNode left = root.left;
		TreeNode right = root.right;
		
		//swap right node to left node
		root.left = invertTree(right);
		//swap left node to right node
		root.right = invertTree(left);
		
		return root;
	}

}
