package BaiTapLopJavaBuoi5;

import java.util.ArrayList;

public class Main {
	static ArrayList<Student> dssv = new ArrayList<>();

	public static void main(String[] args) {
		nhapThongTinSV();
		inThongTin();
	}

	public static void nhapThongTinSV() {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.Input();
		s2.Input();
		dssv.add(s1);
		dssv.add(s2);
	}

	public static void inThongTin() {
		System.out.printf("%-20s %-15s %-15s %-15s %-15s %-15s %-15s %n", "TenTruong", "NgayVaoTruong", "TenKhoa",
				"NgayVaoKhoa", "TenSinhVien", "Lop", "DiemSo");
        for(Student s:dssv) {
        	s.Output();
        }
	}

}
