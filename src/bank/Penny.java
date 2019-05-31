package bank;

public class Penny extends Bank {
	public Penny(int quantity) {
		super(quantity);
		this.value = .01;
	}

	public Penny() {
		this.value = .01;
	}

	@Override
	public String toString() {
		return (quantity + " Penny");
	}
}