/*
Copyright 2010 kiddy
*/
package linkedlist;

import java.util.LinkedList;

public class Node<T> {
	
	Node<T> next = null;
	T data;
	
	public Node(T d) {
		this.data = d;
	}
	
	public void appendToTail(T data) {
		Node<T> end = new Node<T>(data);
		end.data = data;
		Node<T> n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	public void printLinkedList() {
		Node<T> n = this;
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
//		LinkedList<E>
		Node<Integer> header = new Node<Integer>(1);
		header.appendToTail(2);
		header.appendToTail(3);
		header.printLinkedList();
	}
}
