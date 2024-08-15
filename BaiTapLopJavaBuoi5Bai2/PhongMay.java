package BaiTapLopJavaBuoi5Bai2;

import java.util.Scanner;

public class PhongMay {
	private String maPhong;
	private String tenPhong;
	private double dienTich;
	private QuanLy x;
	private May[] y;
	private Integer n;

	public PhongMay() {
		x = new QuanLy();
		y = new May[1];
	}

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ma Phong: ");
		maPhong = sc.nextLine();
		System.out.println("Nhap Ten Phong: ");
		tenPhong = sc.nextLine();
		System.out.println("Nhap Dien Tich Phong: ");
		dienTich = sc.nextDouble();
		sc.nextLine();
		x.Nhap();
		System.out.println("Nhap So May Trong Phong: ");
		n = sc.nextInt();
		y = new May[n];
		for (int i = 0; i < n; i++) {
			y[i] = new May();
			y[i].Nhap();
		}
	}

	public void Xuat() {
		System.out.printf("%-20s %-20s %-20.2f %-20s", maPhong, tenPhong, dienTich, n);
		x.Xuat();
		System.out.println();
		System.out.printf("%-20s %-20s %-20s %n","MaMay","TenMay","TinhTrang");
		for(int i=0; i<n; i++) {
			y[i].Xuat();
		}
	}

}
