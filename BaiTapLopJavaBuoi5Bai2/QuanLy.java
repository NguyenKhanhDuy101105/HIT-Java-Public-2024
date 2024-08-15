package BaiTapLopJavaBuoi5Bai2;

import java.util.Scanner;

public class QuanLy {
	private String maQL;
	private String hoTen;

	public QuanLy() {

	}

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ma Quan Li: ");
		maQL = sc.nextLine();
		System.out.println("Nhap Ho Ten: ");
		hoTen = sc.nextLine();
	}

	public void Xuat() {
		System.out.printf("%-20s %-20s %n", maQL, hoTen);
	}

}
