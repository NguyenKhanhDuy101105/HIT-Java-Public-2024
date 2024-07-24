package BaiTapLopJavaPublic;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int[][] a = new int[n][n];
		int giaTri=1;
		int h1=0, h2=n-1, c1=0, c2=n-1;
		while(giaTri<=n*n) {
			for(int i=c1; i<=c2; i++) {
				a[h1][i]=giaTri;
				giaTri++;
			}
			h1++;
			for(int i=h1; i<=h2; i++) {
				a[i][c2]=giaTri;
				giaTri++;
			}
			c2--;
			for(int i=c2; i>=c1; i--) {
				a[h2][i]=giaTri;
				giaTri++;
			}
			h2--;
			for(int i=h2; i>=h1; i--) {
				a[i][c1]=giaTri;
				giaTri++;
			}
			c1++;
		}
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
		
		
		
	}
}