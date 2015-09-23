/*
Copyright 2010 kiddy
*/
package array;

public class Solution {

	public static int rotatedBinarySearch(int A[], int N, int key) {
		int L = 0;
		int R = N-1;
		
		while(L <= R) {
			int M = L + ((R - L) / 2);
			if(A[M] == key) return M;
			
			if(A[L] <= A[M]) {
				if(A[L] <= key && key < A[M])
					R = M - 1;
				else
					L = M + 1;
			} else {
				if(A[M] < key && key <= A[R])
					L = M + 1;
				else
					R = M - 1;
			}
		}
		return -1;
	}
	
	public static int findGivenString(String[] strArr, String target, int left, int right) {
		int first = left;
		int end = right;
		while(strArr[end] == "" && first < end) {
			end--;
		}
		if(first == end) {
			return -1;
		}
		int mid = (end - first) / 2;
		while(strArr[mid] == "") {
			mid++;
		}
		int result = strArr[mid].compareTo(target);
		if(result == 0) {
			return mid;
		} else if(result < 0) {
			return findGivenString(strArr, target, mid+1, end);
		} else {
			return findGivenString(strArr, target, first, mid-1);
		}
		
	}
	
	public static void main(String[] args) {
		//test case for findGivenString
		String[] strArr = {"at", "", "", "", "ball", "", "", 
				"car", "", "", "dad","",""};
		int result = findGivenString(strArr, "ball", 0, strArr.length-1);
		System.out.println(result);
	}
}
