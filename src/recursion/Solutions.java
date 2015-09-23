/*
Copyright 2010 kiddy
*/
package recursion;

import java.util.ArrayList;
import java.util.Iterator;

public class Solutions {
	
	public static void main(String[] args) {
		System.out.println(makeChange(10, 25));
		/*
		int count = 2;
		char[] str = new char[count*2];
		printPar(count, count, str, 0);
		
		String s = "abc";
		ArrayList<String> perms = getPerms(s);
		Iterator<String> iter = perms.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}

		ArrayList<Integer> set = new ArrayList<Integer>();
		
		set.add(Integer.valueOf(1));
		set.add(Integer.valueOf(2));
		set.add(Integer.valueOf(3));
		ArrayList<ArrayList<Integer>> allSubsets = getSubsets(set);
		Iterator<ArrayList<Integer>> allIter = allSubsets.iterator();
		while(allIter.hasNext()) {
			Iterator<Integer> iter = allIter.next().iterator();
			while(iter.hasNext()) {
				Integer i = iter.next();
				System.out.print(i + " ");
			}
			System.out.println();
		}*/
	}
	
	public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set) {
		ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<ArrayList<Integer>>();
		
		int max = 1 << set.size();
		for(int i=0; i < max; i++) {
			ArrayList<Integer> subset = new ArrayList<Integer>();
			
			int k = i;
			int index = 0;
			while(k > 0) {
				if((k & 1) == 1) {
					subset.add(set.get(index));
				}
				k >>= 1;
				index++;
			}
			allSubsets.add(subset);
		}
		return allSubsets;
	}
	
	public static ArrayList<String> getPerms(String s) {
		ArrayList<String> permutation = new ArrayList<String>();
		if(s == null) {
			return null;
		} else if(s.length() == 0) {
			permutation.add("");
			return permutation;
		}
		
		char first = s.charAt(0);
		String remainder = s.substring(1);
		ArrayList<String> words = getPerms(remainder);
		for(String word : words) {
			for(int i=0; i <= word.length(); i++) {
				permutation.add(insertCharAt(word, first, i));
			}
		}
		return permutation;
	}
	
	public static String insertCharAt(String s, char c, int index) {
		String start = s.substring(0, index);
		String end = s.substring(index);
		return start+c+end;	
	}
	
	public static void printPar(int left, int right, char[] str, int count) {
		if(left < 0 || right < left) return;
		if(left == 0 && right == 0) { //get all situations
			System.out.println(str);
		} else {
			if(left > 0) {
				str[count] = '(';
				printPar(left-1, right, str, count+1);
			}
			if(right > 0) {
				str[count] = ')';
				printPar(left, right-1, str, count+1);
			}
		}
	}
	
	public static int makeChange(int n, int denom) {
		int next_denom = 0;
		switch(denom) {
		case 25:
			next_denom = 10;
			break;
		case 10:
			next_denom = 5;
			break;
		case 5:
			next_denom = 1;
			break;
		case 1:
			return 1;
		}
		int ways = 0;
		for(int i = 0; i * denom <= n; i++) {
			ways += makeChange(n-i*denom, next_denom);
		}
		return ways;
	}
	
}
