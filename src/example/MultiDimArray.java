package example;

import java.util.*;

public class MultiDimArray {

	/**
	 * @param args
	 */
	static Random rand = new Random();
	static int pRand(int mod){
		return Math.abs(rand.nextInt()) % mod + 1;
	}
	static void prt(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a1 = {
				{1, 2, 3,},
				{4, 5, 6,},
		};
		for (int i = 0; i < a1.length; i++)
			for (int j = 0; j < a1[i].length; j++)
				prt("a1[" + i + "][" + j + "]=" + a1[i][j]);
		//3-D array with fixed length;
		int[][][] a2 = new int[2][2][4];
		for (int i = 0; i < a2.length; i++)
			for (int j = 0; j < a2[i].length; j++)
				for (int k = 0; k < a2[i][j].length; k++)
					prt("a2[" + i + "][" + j + "][" + k + "]=" + a2[i][j][k]);
		//3-D array with varied-length vectors;
		int[][][] a3 = new int[pRand(7)][][];
		for (int i = 0; i < a3.length; i++){
			a3[i] = new int[pRand(5)][];
			for (int j = 0; j < a3[i].length; j++)
				a3[i][j] = new int[pRand(5)];
		}
		for (int i = 0; i < a3.length; i++)
			for (int j = 0; j < a3[i].length; j++)
				for (int k = 0; k < a3[i][j].length; k++)
					prt("a3[" + i + "][" + j + "][" + k + "]="
							+ a3[i][j][k]);
	}
}
