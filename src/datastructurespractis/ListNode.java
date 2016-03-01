package datastructurespractis;

public class ListNode {
	private int data;
	private ListNode next;

	public ListNode() {
		next = null;
		data = Integer.MIN_VALUE;
	}

	public ListNode(int data) {
		next = null;
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

}
