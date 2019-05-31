package bank;

public class Dollar extends Bank {
	public Dollar(int quantity) {
		super(quantity);
		this.value = 1.0;
	}

	public Dollar() {
		this.value = 1.0;
	}

	@Override
	public String toString() {
		return ("$" + quantity);
	}
}