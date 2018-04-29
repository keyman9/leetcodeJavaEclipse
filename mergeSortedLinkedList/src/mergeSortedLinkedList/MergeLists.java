package mergeSortedLinkedList;

public class MergeLists {

	public static void main(String[] args) {
		ListNode a1 = new ListNode(1);
		ListNode a3 = new ListNode(2);
		ListNode a5 = new ListNode(4);
		a1.next = a3;
		a3.next = a5;
		
		ListNode a2 = new ListNode(1);
		ListNode a4 = new ListNode(3);
		ListNode a6 = new ListNode(4);
		a2.next = a4;
		a4.next = a6;
		/*
		while(a1 != null) {
			System.out.printf("%d -> ", a1.val);
			a1 = a1.next;
		}
		
		System.out.println("\n---------------");
		
		while(a2 != null) {
			System.out.printf("%d -> ", a2.val);
			a2 = a2.next;
		}
		
		System.out.println("\n---------------");
		*/
		ListNode toPrint = new ListNode(0);
		toPrint = mergeTwoLists(a1,a2);
		while(toPrint != null) {
			System.out.printf("%s -> ", toPrint.val);
			toPrint = toPrint.next;
		}
		
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		ListNode head = null;
		
		if(l1 == null) {
			return l2;
		}
		if(l2 == null) {
			return l1;
		}
		
		if(l1.val < l2.val) {
			head = l1;
			head.next = mergeTwoLists(l1.next,l2);
		}
		else {
			head = l2;
			head.next = mergeTwoLists(l1, l2.next);
		}
		
		return head;
	}

}