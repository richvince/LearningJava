package example;
import java.util.Arrays;
public class Matrix {

	/**
	 * @param args
	 */
public static int[][] mutiply(int[][] matrix1,int[][]matrix2)
	{
		if(matrix1[0].length!=matrix2.length){//若无法相乘则退出
			   System.out.println("ivalid input");
			   System.exit(0);
			  }
			  
			  int[][] r = new int[matrix1.length][matrix2[0].length];
			  for(int i=0;i<r.length;++i){
			   for(int j=0;j<r[i].length;++j){//每一个r[i][j]的运算：
			    r[i][j]=0;//初始化
			    for(int k=0;k<matrix2.length;++k)
			     r[i][j]+=matrix1[i][k]*matrix2[k][j];
			   }
			  }
			  return r;
	}
	 static int[][] matrix1;
	 static int[][] matrix2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 matrix1=new int[][]{{1,1,1,1}};
		  matrix2=new int[][]{{2},{2},{2},{2}};
		  int[][] result = new int[matrix1.length][matrix2[0].length];
		  result = mutiply(matrix1,matrix2);		  
		  //输出结果
		  for(int i=0;i<result.length;++i)
		   System.out.println(Arrays.toString(result[i]));
		 }

	}


