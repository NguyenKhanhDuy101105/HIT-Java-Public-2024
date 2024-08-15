package BaiTapLopJavaBuoi5Bai2;

public class Main {
	static PhongMay pm1 = new PhongMay();

	public static void main(String[] args) {
     nhapThongTin();
     inThongTin();
	}

	public static void nhapThongTin() {
		pm1.Nhap();
	}

	public static void inThongTin() {
		System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %n", "MaPhong", "TienPhong", "DienTich", "SoMayCo",
				"MaQL", "HoTenQL");
		pm1.Xuat();
	}

}
