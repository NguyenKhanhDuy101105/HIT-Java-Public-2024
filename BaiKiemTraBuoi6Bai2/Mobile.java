package BaiKiemTraBuoi6Bai2;

public class Mobile extends Product {
	private String mobile_manufacturer;
	private int mobile_ram;

	public Mobile(String product_id, String product_name, int product_price, int product_total) {
		super(product_id, product_name, product_price, product_total);
	}

	public Mobile(String product_id, String product_name, int product_price, int product_total,
			String mobile_manufacturer, int mobile_ram) {
		super(product_id, product_name, product_price, product_total);
		this.mobile_manufacturer = mobile_manufacturer;
		this.mobile_ram = mobile_ram;
	}

	@Override
	public double getTotalPrice() {
		return product_total * product_price + 0.2*(product_total * product_price);
	}

	@Override
	public String toString() {
		super.toString();
		return "Mobile [mobile_manufacturer=" + mobile_manufacturer + ", mobile_ram=" + mobile_ram + "]";
	}

	@Override
	public void inDL() {
		super.inDL();
		System.out.printf("%-20s %-20s %-20.2f %n",mobile_manufacturer,mobile_ram,getTotalPrice());
	}
	

}
