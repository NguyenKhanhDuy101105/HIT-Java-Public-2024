package BaiKiemTraBuoi6Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static ArrayList<Mobile> dsdt = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Bai 1
		Bai1();
		
		// Bai 3 
		fakeData();
		in();
		sapXepTheoTongGia();
		in();
		timKiem();
	}

	public static void fakeData() {
		Mobile mb1 = new Mobile("001", "I Phone X", 100, 3, "Apple", 256);
		Mobile mb2 = new Mobile("002", "I Phone 8", 50, 3, "Apple", 126);
		Mobile mb3 = new Mobile("003", "I Phone 11 Plus", 200, 5, "Apple", 64);
		Mobile mb4 = new Mobile("004", "I Phone XSMax", 300, 1, "Apple", 1024);
		Mobile mb5 = new Mobile("005", "I Phone 15", 600, 5, "Apple", 126);
		dsdt.add(mb1);
		dsdt.add(mb2);
		dsdt.add(mb3);
		dsdt.add(mb4);
		dsdt.add(mb5);
	}

	public static void inTieuDe() {
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %n", "MaSP", "TenSP", "Gia", "SoLuong",
				"HangSanXuat", "BoNho", "TongChiPhi");
	}

	public static void in() {
		inTieuDe();
		for (Mobile s : dsdt) {
			s.inDL();
		}
		System.out.println();
	}

	public static void sapXepTheoTongGia() {
		Collections.sort(dsdt, Comparator.comparing(Mobile::getTotalPrice));
	}

	public static void timKiem() {
		System.out.println("Nhap vao ten sp muon tim: ");
		String ten = sc.nextLine();
		int pos = Collections.binarySearch(dsdt, new Mobile(null, ten, 0, 0, null, 0), new SortByName());
		if (pos < 0) {
			System.out.println("Khong co trong danh sach");
		} else {
			inTieuDe();
			dsdt.get(pos).inDL();
		}

	}
	
	public static void Bai1() {
		System.out.println("Nhap so luong chuoi muon nhap: ");
		int soluong = sc.nextInt();
		sc.nextLine();
		String[] chuoi = new String[soluong];
		for(int i=0; i<soluong; i++) {
			chuoi[i] = sc.nextLine();
		}
		for(int i=0; i<soluong; i++) {
			int dem =0;
			for(int j=0; j<chuoi[i].length(); j++) {
				if(chuoi[i].charAt(j) ==' ') {
					dem++;
				}
			}
			System.out.println(dem);
		}
	}

}
