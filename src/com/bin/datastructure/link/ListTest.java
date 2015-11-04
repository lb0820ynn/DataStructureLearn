package com.bin.datastructure.link;

public class ListTest {

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		Integer[] data = { 1, 2, 3, 5, 6 };
		list.arrayToList(data);
		list.printList();
		
		list.add(5, 10);
		System.out.println("-----------");
		list.printList();
		
		System.out.println("-----------");
		list.remove(2);
		list.printList();
		
		System.out.println("-----------");
		Integer i = list.get(2);
		System.out.println(i);
		
		System.out.println("-----------");
		list.reverseList();
		
		System.out.println("-----------");
		list.reverseListRecursive();
	}
	
	
}
