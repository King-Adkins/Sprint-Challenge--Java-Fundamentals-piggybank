package bank;

public class Quarter extends Bank {
	public Quarter(int quantity) {
		super(quantity);
		this.value = 0.25;
	}

	public Quarter() {
		this.value = 0.25;
	}

	@Override
	public String toString() {
		return (quantity + " Quarter");
	}
}