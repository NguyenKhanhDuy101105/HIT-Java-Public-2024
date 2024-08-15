package BaiTapLopJavaBuoi5;

import java.util.Scanner;

public class Faculty {
	private String Name;
	private String Date;
	private School x;

	public Faculty() {
		x = new School();
	}

	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten truong: ");
		x.setName(sc);
		System.out.println("Nhap ngay vao truong theo dang dd/mm/yyyy: ");
		x.setDate(sc);
		System.out.println("Nhap ten khoa: ");
		Name = sc.nextLine();
		System.out.println("Nhap ngay vao khoa theo dang dd/mm/yyyy: ");
		Date = sc.nextLine();
	}

	public void Output() {
		System.out.printf("%-20s %-15s %-15s %-15s", x.getName(), x.getDate(), Name, Date);
	}
}
