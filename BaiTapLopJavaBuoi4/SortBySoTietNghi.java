package BaiTapLopJavaBuoi4;

import java.util.Comparator;

public class SortBySoTietNghi implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getSoTietNghi()>o2.getSoTietNghi()) return 1;
		else if(o1.getSoTietNghi()<o2.getSoTietNghi()) return -1;
		else return 0;
	}

}
