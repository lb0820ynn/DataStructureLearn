package com.bin.datastructure.link;

public class ListNode<T> {
	public T value;
	public ListNode<T> next;
	public ListNode<T> pre;
	public ListNode(T value, ListNode<T> next, ListNode<T> pre) {
		super();
		this.value = value;
		this.next = next;
		this.pre = pre;
	}
	
	public ListNode(T value, ListNode<T> next) {
		super();
		this.value = value;
		this.next = next;
	}

}
