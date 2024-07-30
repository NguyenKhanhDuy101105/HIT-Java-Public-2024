package BaiTapLopJavaBuoi2;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		final String hinhVuong = "Square";
		final String hinhTron = "Circle";
		final String hinhTamGiac = "Triangle";

		System.out.println("Nhap hinh dang: ");
		String type = new Scanner(System.in).nextLine();

		if (type.equals(hinhVuong)) {
			System.out.println("Day la hinh vuong");
			System.out.println("Nhap do dai canh hinh vuong: ");
			int a = new Scanner(System.in).nextInt();
			int dienTichHinhVuong = (int)Math.pow(a, 2);
			System.out.println("Dien tich hinh vuong la: " + dienTichHinhVuong);
		} else if (type.equals(hinhTron)) {
			System.out.println("Day la hinh tron");
			System.out.println("Nhap vao ban kinh hinh tron: ");
			int r = new Scanner(System.in).nextInt();
			double dienTichHinhTron = Math.PI * Math.pow(r, 2);
			dienTichHinhTron = Math.round(dienTichHinhTron * 100.0) / 100.0;
			System.out.printf("Dien tich hinh tron La: " + dienTichHinhTron);
		} else if (type.equals(hinhTamGiac)) {
			System.out.println("Day la hinh tam giac");
			System.out.println("Nhap vao do dai ba canh cua tam giac: ");
			int x = new Scanner(System.in).nextInt();
			int y = new Scanner(System.in).nextInt();
			int z = new Scanner(System.in).nextInt();
			if (x + y > z && y + z > x && x + z > y) {
				double nuaChuVi = (x + y + z) / 2;
				double dienTichTamGiac = Math.sqrt(nuaChuVi * (nuaChuVi - x) * (nuaChuVi - y) * (nuaChuVi - z));
				dienTichTamGiac = Math.round(dienTichTamGiac * 100.0) / 100.0;
				System.out.printf("Dien tich tam giac la: " + dienTichTamGiac);
			} else {
				System.out.print(-1);
			}
		} else {
			System.out.println("Hinh dang khong hop le!");
		}
	}

}
