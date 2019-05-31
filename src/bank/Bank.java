package bank;

public class Bank {
	public double value;
	public int quantity;
	public Bank(int quantity) {
		this.quantity = quantity;
	}

	public Bank() {
		this.quantity = 1;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}