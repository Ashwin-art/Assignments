package week1.day2;

public class MyCalculator {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.add(23, 44, 22));
		System.out.println(calculator.sub(400, 200));
		System.out.println(calculator.mul(9959, 332));
		System.out.println(calculator.divide(22, 10));
	}

}
