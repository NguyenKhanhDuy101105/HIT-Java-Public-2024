package BaiTapLopJavaBuoi4;

import java.util.Calendar;
import java.util.Scanner;

public class Student {
	private String ten;
	private int namSinh;
	private String diaChi;
	private double diemTX1, diemTX2, diemKTHP;
	private int soTietNghi;

	public Student(String ten, int namSinh, String diaChi, double diemTX1, double diemTX2, double diemKTHP,
			int soTietNghi) {
		this.ten = ten;
		this.namSinh = namSinh;
		this.diaChi = diaChi;
		this.diemTX1 = diemTX1;
		this.diemTX2 = diemTX2;
		this.diemKTHP = diemKTHP;
		this.soTietNghi = soTietNghi;
	}

	public Student() {
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public double getDiemTX1() {
		return diemTX1;
	}

	public void setDiemTX1(double diemTX1) {
		this.diemTX1 = diemTX1;
	}

	public double getDiemTX2() {
		return diemTX2;
	}

	public void setDiemTX2(double diemTX2) {
		this.diemTX2 = diemTX2;
	}

	public double getDiemKTHP() {
		return diemKTHP;
	}

	public void setDiemKTHP(double diemKTHP) {
		this.diemKTHP = diemKTHP;
	}

	public int getSoTietNghi() {
		return soTietNghi;
	}

	public void setSoTietNghi(int soTietNghi) {
		this.soTietNghi = soTietNghi;
	}
    
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten sinh vien: ");
		ten = sc.nextLine();
		System.out.println("Nhap nam sinh: ");
		namSinh = sc.nextInt();
		System.out.println("Nhap dia chi: ");
		diaChi = new Scanner(System.in).nextLine();
		System.out.println("Nhap diemTX1: ");
		diemTX1 = sc.nextDouble();
		System.out.println("Nhap diemTX2: ");
		diemTX2 = sc.nextDouble();
		System.out.println("Nhap diemKTHP: ");
		diemKTHP = sc.nextDouble();
		System.out.println("Nhap so tiet nghi: ");
		soTietNghi = sc.nextInt();
	}
	
	public int getTuoi() {
		Calendar cal = Calendar.getInstance();
		int yearNow = cal.get(Calendar.YEAR);
		return yearNow - namSinh;
	}

	public double getGPA() {
		return (diemTX1 * 0.2 + diemTX2 * 0.3 + diemKTHP * 0.5);
	}

	public static void inTieuDe() {
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %n", "Ten", "Tuoi", "DiaChi", "DiemTX1",
				"DiemTX2", "DiemKTHP", "DiemGPA", "SoTietNghi");
	}

	public void inDL() {
		System.out.printf("%-20s %-20s %-20s %-20.2f %-20.2f %-20.2f %-20.2f %-20s %n", ten, getTuoi(), diaChi, diemTX1,
				diemTX2, diemKTHP, getGPA(), soTietNghi);
	}
}
