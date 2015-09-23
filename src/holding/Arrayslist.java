/*
Copyright 2010 kiddy
*/
package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Arrayslist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
		for (Integer c : list)
			System.out.print(c + " ");
		System.out.println();
		ListIterator<Integer> it = list.listIterator();
		System.out.println(it.next()+":"+it.previousIndex()+","+it.nextIndex());
		System.out.println(it.previous()+":"+it.previousIndex()+","+it.nextIndex());
	}

}
