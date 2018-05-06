package maxDepthofBinTree;


import static org.junit.Assert.assertEquals;

public class MaxDepth {
	/*
	 * Description:
	 * Given a binary tree, find its maximum depth.
	 * 
	 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
	 * 
	 * Note:
	 * A leaf is a node with no children.
	 * 
	 * Example:
	 * Given {r,L,R} [3,9,20,null,null,15,7]
	 * Depth = 3
	 */

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		TreeNode t1_l = new TreeNode(9);
		TreeNode t1_r = new TreeNode(20);
		TreeNode t1_rl = new TreeNode(15);
		TreeNode t1_rr = new TreeNode(7);
		t1.left = t1_l;
		t1.right = t1_r;
		t1_r.left = t1_rl;
		t1_r.right = t1_rr;
		
		TreeNode t1_in = t1;
		int t1_out = 3;
		assertEquals(maxDepth(t1_in),t1_out);

	}
	
	public static int maxDepth(TreeNode root) {

		//if node is not present, do not add to total
		if(root == null) {
			return 0;
		}
		
		//check left and right nodes
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		
		//check which node is deeper, return it plus 1 (since null returns 0)
		if(leftDepth > rightDepth) {
			return leftDepth+1;
		}
		else {
			return rightDepth+1;
		}
		
	}
	
}
