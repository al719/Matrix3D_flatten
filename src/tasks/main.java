package tasks;
import java.util.Iterator;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the matrix dimensions: ");
				int n = scan.nextInt();
				int m = scan.nextInt();
				int p = scan.nextInt();
				int y =0;
//				int[][][] arr = {
//						/*(0)*/{{1,2,3},{4,5,6}},//1st array
//						/*(1)*/{{7,8,9},{10,11,12}},//2nd array
//						/*(2)*/{{4,9,1},{0,7,3}}//3rd array
//				};
				int[][][] arr3D = new int[n][m][p];
				for(int i = 0;i<n;i++) {
					for(int j = 0;j<m;j++) {
						for(int k = 0;k<p;k++) {
							System.out.println("Enter arr3D["+i+"]["+j+"]["+k+"]: ");
							arr3D[i][j][k] = scan.nextInt();
						}
					}
				}
				
				int q = n*m*p;
				int vect1D[] = new int[q];
				
				for(int i = 0;i<n;i++) {
					for(int j = 0;j<m;j++) {
						for(int k = 0;k<p;k++) {
							vect1D[y] = arr3D[i][j][k];
							y++;
						}
					}
				}
				for(int i = 0;i<vect1D.length;i++) {
					System.out.print(vect1D[i]+" "); 
				}
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("it's a run time exception error!");
				}
		        
			}

		

	}


