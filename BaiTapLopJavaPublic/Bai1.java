package BaiTapLopJavaPublic;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		double r = new Scanner(System.in).nextDouble();
		double dienTich = Math.PI * Math.pow(r, 2);
		double chuVi = 2 * Math.PI * r;
		System.out.println(chuVi + " " + dienTich);

	}

}
