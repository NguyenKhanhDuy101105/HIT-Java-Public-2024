package BaiTapLopJavaBuoi4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static ArrayList<Student> dssv = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Bai 1
		fakeData();
		inThongTin();
		// Bai 2
		luaChon();
	}

	public static void fakeData() {
		Student sv1 = new Student("Nguyen Van A", 2001, "Ha Noi", 8.5, 7.5, 9.25, 0);
		Student sv2 = new Student("Nguyen Thi B", 2005, "Thanh Hoa", 6, 7, 8.5, 2);
		Student sv3 = new Student("Lo Thi C", 2002, "Thai Binh", 9, 9, 10, 0);
		Student sv4 = new Student("Tran Kha D", 2003, "Nghe An", 4.5, 5.5, 7.25, 3);
		Student sv5 = new Student("Truong Dinh E", 2004, "Quang Ninh", 8, 8, 8.25, 1);
		dssv.add(sv1);
		dssv.add(sv2);
		dssv.add(sv3);
		dssv.add(sv4);
		dssv.add(sv5);
	}

	public static void inThongTin() {
		Student.inTieuDe();
		for (Student s : dssv) {
			s.inDL();
		}
		System.out.println();
	}

	public static void themSVM() {
		Student s = new Student();
		s.nhap();
		dssv.add(s);
	}

	public static void suaTTSV() {
		System.out.println("Nhap vi tri cua sinh vien muon sua trong danh sach: ");
		int index = sc.nextInt();
		dssv.remove(index);
		Student s = new Student();
		s.nhap();
		dssv.add(index, s);

	}

	public static void sapTheoTuoi() {
		SortByAge s = new SortByAge();
		Collections.sort(dssv, s);
	}

	public static void sapTheoDiem() {
		SortByPoint s = new SortByPoint();
		Collections.sort(dssv, s);
	}

	public static void sapTheoSoTietNghi() {
		SortBySoTietNghi s = new SortBySoTietNghi();
		Collections.sort(dssv, s);
	}

	public static void xoaSV() {
		System.out.println("Nhap vi tri cua sinh vien muon xoa trong danh sach: ");
		int index = sc.nextInt();
		dssv.remove(index);
	}

	public static void luaChon() {
		while (true) {
			System.out.println("\t\t\t\t\t\t----------------MENU-----------------");
			System.out.println("NHAN 1 DE THEM SINH VIEN MOI" + "\nNHAN 2 DE SUA THONG TIN SINH VIEN\n"
					+ "NHAN 3 DE SAP XEP SINH VIEN THEO TUOI\n" + "NHAN 4 DE SAP XEP SINH VIEN THEO GPA\n"
					+ "NHAN 5 DE SAP XEP SINH VIEN THEO SO TIET NGHI\n" + "NHAN 6 DE XOA SINH VIEN KHOI DANH SACH\n");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				themSVM();
				System.out.println("DANH SACH SINH VIEN SAU KHI THEM SINH VIEN MOI: ");
				inThongTin();
				break;
			case 2:
				suaTTSV();
				System.out.println("DANH SACH SINH VIEN SAU KHI SUA: ");
				inThongTin();
				break;
			case 3:
				sapTheoTuoi();
				System.out.println("DANH SACH SINH VIEN SAU KHI SAP THEO TUOI TANG DAN: ");
				inThongTin();
				break;
			case 4:
				sapTheoDiem();
				System.out.println("DANH SACH SINH VIEN SAU KHI SAP THEO DIEM TANG DAN: ");
				inThongTin();
				break;
			case 5:
				sapTheoSoTietNghi();
				System.out.println("DANH SACH SINH VIEN SAU KHI SAP THEO SO TIET NGHI TANG DAN: ");
				inThongTin();
				break;
			case 6:
				xoaSV();
				System.out.println("DANH SACH SINH VIEN SAU KHI XOA: ");
				inThongTin();
				break;
			default:
				System.out.println("LUA CHON KHONG TON TAI\nVUI LONG NHAP LAI HOAC NHAP -1 DE THOAT KHOI CHUONG TRINH");
				break;

			}
			if (choose == -1) {
				System.out.println("BAN DA THOAT");
				break;
			}

		}

	}

}
