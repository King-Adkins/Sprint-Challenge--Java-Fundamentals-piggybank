package bank;

public class Nickel extends Bank {
	public Nickel(int quantity) {
		super(quantity);
		this.value = .05;
	}

	public Nickel() {
		this.value = .05;
	}

	@Override
	public String toString() {
		return (quantity + " Nickel");
	}
}