package BaiKiemTraBuoi6Bai2;

import java.util.Comparator;

public class SortByName implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return o1.getProduct_name().compareToIgnoreCase(o2.getProduct_name());
	}

}
