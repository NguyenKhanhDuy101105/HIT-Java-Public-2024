package BaiTapLopJavaBuoi2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		String chuoiKyTu = new Scanner(System.in).nextLine();
		int doDaiChuoi = chuoiKyTu.length();
		int viTriGiua = doDaiChuoi / 2;
		int L = 0, R = doDaiChuoi - 1, dem = 0;
		for (int i = 0; i < viTriGiua; i++) {
			if (chuoiKyTu.charAt(L) == chuoiKyTu.charAt(R)) {
				dem++;
			}
			L++;
			R--;
		}

		if (dem == viTriGiua) {
			String chuoiKyTuHoa = chuoiKyTu.toUpperCase();
			System.out.println(chuoiKyTuHoa);
		} else {
			String chuoiKyTuThuong = chuoiKyTu.toLowerCase();
			System.out.println(chuoiKyTuThuong);
		}

	}
}
