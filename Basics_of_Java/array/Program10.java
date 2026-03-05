package array;

public class Program10 {

	public static void main(String[] args) {
		int[][] a= {{1,1},{1,1}};
		int[][] b= {{1,2},{3,1}};
		int[][] result=sum(a,b);
		print(result);
		
	}
	public static void print(int[][] res) {
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.printf(res[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] sum(int[][] a,int[][] b){
		int row=a.length;
		int col = a[0].length;
		int[][] res=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				res[i][j]=a[i][j]+b[j][i];
			}
		}
		return res;
	}

}
