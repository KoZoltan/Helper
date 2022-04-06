package myproducts;

public class Product {

	private String name;
	private int netPrice;
	private int tax;

	public Product() {

	}

	public Product(String name, int netPrice, int tax) {
		super();
		this.name = name;
		this.netPrice = netPrice;
		this.tax = tax;
	}

	public int brutPrice() {
		return this.netPrice + (this.netPrice * (this.tax / 100));
	}

	@Override
	public String toString() {
		return "Nev= " + name + ", Brutto ar= " + netPrice;
	}

	public void netPriceInc(int percentage) {
		this.netPrice = this.netPrice + (percentage * (this.tax / 100));
	}

	public int CompareBrut(Product first) {

		if (this.netPrice > first.netPrice)
			return -1;
		else if (this.netPrice < first.netPrice)
			return 1;
		else
			return 0;
	}

}
