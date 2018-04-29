package mergeTwoBinaryTrees;

public class MergeTrees {

	public static void main(String[] args) {
		/*
		 * Description:
		 * Given two binary trees, imagine that when you put one of them to cover the other,
		 *   some of the nodes of both trees overlap, while others do not.
		 * 
		 * You need to merge them into a new binary tree. 
		 * The merge rule is that if two nodes overlap, their sum should be the value of the new merged node.
		 * Otherwise, the NOT null node will be used as the node of the new tree.
		 */
		
		TreeNode t1_root = new TreeNode(1);
		TreeNode t1_l = new TreeNode(3);
		TreeNode t1_r = new TreeNode(2);
		TreeNode t1_ll = new TreeNode(5);
		t1_root.left = t1_l;
		t1_root.right = t1_r;
		t1_l.left = t1_ll;
		
		TreeNode t2_root = new TreeNode(2);
		TreeNode t2_l = new TreeNode(1);
		TreeNode t2_r = new TreeNode(3);
		TreeNode t2_lr = new TreeNode(4);
		TreeNode t2_rr = new TreeNode(7);
		t2_root.left = t2_l;
		t2_root.right = t2_r;
		t2_l.right = t2_lr;
		t2_r.right = t2_rr;
		
		TreeNode t3_root = new TreeNode(3);
		TreeNode t3_l = new TreeNode(4);
		TreeNode t3_r = new TreeNode(5);
		TreeNode t3_ll = new TreeNode(5);
		TreeNode t3_lr = new TreeNode(4);
		TreeNode t3_rr = new TreeNode(7);
		t3_root.left = t3_l;
		t3_root.right = t3_r;
		t3_l.left = t3_ll;
		t3_l.right = t3_lr;
		t3_r.right = t3_rr;
		
		TreeNode merged = mergeTrees(t1_root,t2_root);
		if(identicalTrees(merged,t3_root)) {
			System.out.println("Trees are identical.");
		}
		else {
			System.out.println("Test fail.");
		}
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
	
	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		TreeNode mergedTree = null;
		if(t1 == null && t2 != null) {
			return t2;
		}
		if(t2 == null && t1 != null) {
			return t1;
		}
		//if t1 is not null and t2 is not null, sum
		if(t1 != null && t2 != null) {
			mergedTree = new TreeNode(t1.val + t2.val);
			mergedTree.left = mergeTrees(t1.left,t2.left);
			mergedTree.right = mergeTrees(t1.right,t2.right);	
		}
		return mergedTree;
	}

}
