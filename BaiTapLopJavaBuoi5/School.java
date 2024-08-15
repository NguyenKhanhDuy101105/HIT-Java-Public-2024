package BaiTapLopJavaBuoi5;

import java.util.Scanner;

public class School {
	private String Name;
	private String Date;

	public School() {
		
	}

	public String getName() {
		return Name;
	}

	public void setName(Scanner sc) {
		this.Name = sc.nextLine();
	}

	public String getDate() {
		return Date;
	}

	public void setDate(Scanner sc) {
		this.Date = sc.nextLine();
	}

}
