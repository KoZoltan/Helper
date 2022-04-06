package myproducts;

public class Kenyer extends Product {

	// A konstruktor nem oroklodik
	private double amount;

	public Kenyer() {

	}

	public Kenyer(String name, int netPrice, int tax, double amount) {
		super(name, netPrice, tax);
		this.amount = amount;
	}

	public double getPrizePerAmount() {
		return super.brutPrice() / this.amount;
	}

	@Override
	public String toString() {
		return super.toString() + " egysegar: " + super.brutPrice() / this.amount;
	}

	public double getAmount() {
		return this.amount;
	}

	public static boolean breadPriceCompare(Kenyer b1, Kenyer b2) {

		if (b1.getPrizePerAmount() > b2.getPrizePerAmount())
			return true;
		else
			return false;
	}

}
