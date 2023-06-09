package eu.codefounders;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	private List<Double> numbers = new ArrayList<>();

	private static Calculator CALCULATOR = new Calculator();

	private Calculator() {
	}

	public static Calculator getInstance() {
		return CALCULATOR;
	}

	public Calculator addNumber(double number) {
		this.numbers.add(number);
		return this;
	}

	public Calculator removeLastNumber() {
		if (!this.numbers.isEmpty()) {
			this.numbers.remove(this.numbers.size() - 1);
		}
		return this;
	}

	public Calculator clearNumbers() {
		this.numbers = new ArrayList<>();
		return this;
	}
	
	public double addTotal() {
		double total = 0;
		for (Double num : numbers) {
			total += num;
		}
		return total;
	}

	public double subTotal() {
		double total = 0;
		for (Double num : numbers) {
			total -= num;
		}
		return total;
	}

}
