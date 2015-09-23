/*
Copyright 2010 kiddy
*/
package other;

public class Problems {
	
	//判断是否为奇数，是就返回true
	public static boolean isOdd(int i){
		//return i % 2==1;
		return (i & 1) == 1;
	}
	
	public static void main(String[] args){
		int j = -1;
		System.out.println(Integer.toBinaryString(j));
		for(int i=-2;i<=2;i++){
		System.out.println(isOdd(i));
		}
		System.out.println(2.00-1.10);
//		System.out.println(-1 % 2);
		System.out.println(-2 % 2);
		System.out.println(-3 % 2);
		System.out.println(-4 % 2);
		System.out.println(-5 % 2);
	}
	//请问，这段程序将会输出什么？
           //请解释并优化该代码
}
