package com.bin.datastructure.link;

import java.util.NoSuchElementException;
import java.util.Stack;

import org.junit.Test;

public class MyLinkedList<T> {
	ListNode<T> head = new ListNode<T>(null, null);
	private int size;

	public void arrayToList(T[] data) {
		ListNode<T> p = head;
		for (T t : data) {
			ListNode<T> node = new ListNode<T>(t, null);
			p.next = node;
			p = node;
		}
	}

	public void printList() {
		ListNode<T> p = head.next;
		while (p != null) {
			if (p.value != null) {
				System.out.print(p.value + ",");
			}
			p = p.next;
		}
	}
	
	/**
	 * 增加数据
	 * @param value	要增加的数据
	 */
	public void add(int index, T value){
		ListNode<T> p = head;
		for (int i = 0; i < index; i++) {
			if(p == null){
				break;
			}
			p = p.next;
		}
		if(p == null){
			throw new IndexOutOfBoundsException();
		}
		ListNode<T> node = new ListNode<T>(value, null);
		node.next = p.next;
		p.next = node;
	}
	
	public T remove(int index){
		ListNode<T> pre = head;
		for (int i = 0; i < index; i++) {
			pre = pre.next;
		}
		ListNode<T> p = pre.next;
		pre.next = p.next;
		return p.value;
	}
	
	/**
	 * 得到某个位置上的元素
	 * @param index	位置
	 */
	public T get(int index){
		ListNode<T> p = head;
		for (int i = 0; i < index; i++) {
			if(p == null)
				break;
			p = p.next;
		}
		if(p == null){
			throw new IndexOutOfBoundsException();
		}
		return p.value;
	}
	
	public void reverseList(){
		if(head.next == null){
			return;
		}
		Stack<T> stack = new Stack<T>();
		ListNode<T> p = head.next;
		while (p != null) {
			stack.push(p.value);
			p = p.next;
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + ",");
		}
	}
	
	public void reverseListRecursive(){
		reverseListRecursive(head);
	}
	
	public void reverseListRecursive(ListNode<T> node){
		if(node.next == null){
			return;
		}
		ListNode<T> p = node.next;
		reverseListRecursive(p);
		System.out.print(p.value + ",");
	}
	
}
