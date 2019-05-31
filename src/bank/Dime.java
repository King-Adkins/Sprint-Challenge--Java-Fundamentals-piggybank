package bank;

public class Dime extends Bank {
	public Dime(int quantity) {
		super(quantity);
		this.value = 0.10;
	}

	public Dime() {
		this.value = 0.10;
	}

	@Override
	public String toString() {
		return (quantity + " Dime");
	}
}