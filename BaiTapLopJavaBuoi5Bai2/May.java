package BaiTapLopJavaBuoi5Bai2;

import java.util.Scanner;

public class May {
	private String maMay;
	private String tenMay;
	private String tinhTrang;

	public May() {
	}

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ma May: ");
		maMay = sc.nextLine();
		System.out.println("Nhap Ten May: ");
		tenMay = sc.nextLine();
		System.out.println("Nhap Tinh Trang Cua May: ");
		tinhTrang = sc.nextLine();
	}

	public void Xuat() {
		System.out.printf("%-20s %-20s %-20s %n", maMay, tenMay, tinhTrang);
	}
}
