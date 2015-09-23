/*
Copyright 2010 kiddy
*/
package linkedlist;

import java.util.ConcurrentModificationException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListSample<E> {
	//Pointer to header of list
	Node<E> header = null;
	//Pointer to tail
	Node<E> tail = null;
	// store the number of element in list
	int size = 0;
	int modCount = 0;
	
	//Default Constructor: empty list
	public LinkedListSample() {}
	
	//add to first
	public void addFirst(E elem) {
		Node<E> h = header;
		Node<E> n = new Node<E>(null, elem, header);
		header = n;
		if(h == null) {
			tail = n;
		} else {
			header.prev = n;
		}
		size++;
		modCount++;
	}
	
	//add to tail
	public void addLast(E elem) {
		Node<E> t = tail;
		Node<E> n = new Node<E>(tail, elem, null);
		tail = n;
		if(t == null) {
			header = n;
		} else {
			t.next = n;
		}
		size++;
		modCount++;
	}
	
	// get Iterator for list
	public ListIterator<E> iterator() {
		return new ListIter();
	}
	
	private class ListIter implements ListIterator<E> {
		int nextIndex = 0;
		Node<E> lastReturned = null;
		Node<E> next;
		int expectedModCount = modCount;
		
		ListIter() {
			next = header;
		}	
		
		public boolean hasNext() {
			checkForComodification();
			if(nextIndex < size)
				return true;
			return false;
		}
		
		public E next() {
			checkForComodification();
			if(!hasNext()) {
				throw new IndexOutOfBoundsException();
			}
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.element;
		}
		public void add(E e) {}
		public boolean hasPrevious() {return false;}
		public int nextIndex() {return 0;}
		public E previous() {return null;}
		public int previousIndex() {return 0;}
		public void remove() {}
		public void set(E e) {}
		final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
 	}
	
	static class Node<E> {
		E element;
		Node<E> prev;
		Node<E> next;
		
		Node(Node<E> prev, E elem, Node<E> next) {
			this.prev = prev;
			this.element = elem;
			this.next = next;
		}
	}
	
	public void removeDups() {
		if(header == null) return;
		Node<E> prev = header;
		Node<E> current = header.next;
		
		while(current != null) {
			Node<E> runner = header;
			while(runner != current) {
				if(runner.element.equals(current.element)) {
					Node<E> tmp = current.next;
					prev.next = tmp;
					tmp.prev = prev;
					current = tmp;
					size--;
					modCount++;
					break;
				}
				runner = runner.next;
			}
			if(runner == current) {
				prev = current;
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args) {
//		Hashtable<K, V>
		LinkedListSample<Integer> list = new LinkedListSample<Integer>();
		list.addFirst(Integer.valueOf(1));
		list.addFirst(Integer.valueOf(2));
		list.addFirst(Integer.valueOf(2));
		list.addFirst(Integer.valueOf(2));
		list.removeDups();
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
	}
	
}
