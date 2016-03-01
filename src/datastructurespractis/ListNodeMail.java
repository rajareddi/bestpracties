package datastructurespractis;

public class ListNodeMail {
	public static void main(String[] args) {
		ListNode ls = new ListNode();
		ListNode tem = new ListNode(10);
		ls.setNext(tem);
		/*
		 * ls.setNext(new ListNode(20)); ls.setNext(new ListNode(30));
		 * ls.setNext(new ListNode(40)); ls.setNext(new ListNode(50));
		 */
		while (ls.getNext() != null) {
			System.out.println(ls.getData());
			ls = ls.getNext();
		}

	}
}
