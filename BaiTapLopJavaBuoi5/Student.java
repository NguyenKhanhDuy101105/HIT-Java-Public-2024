package BaiTapLopJavaBuoi5;

import java.util.Scanner;

public class Student {
	private String Name;
	private String Class;
	private double Score;
	private Faculty y;

	public Student() {
		y = new Faculty();
	}  

	public void Input() {
		y.Input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten sinh vien: ");
		Name = sc.nextLine();
		System.out.println("Nhap ten lop: ");
		Class = sc.nextLine();
		System.out.println("Nhap diem so: ");
		Score = sc.nextDouble();
	}

	public void Output() {
		y.Output();
		System.out.printf("%-15s %-15s %-15.2f %n", Name, Class, Score);
	}
}
