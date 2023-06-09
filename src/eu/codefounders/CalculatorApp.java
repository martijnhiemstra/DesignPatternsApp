package eu.codefounders;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calculator = Calculator.getInstance();
		calculator = calculator.addNumber(12).addNumber(24).addNumber(3.5);

		double total = calculator.addTotal();
		System.out.println("Total = " + total);
	}

}
