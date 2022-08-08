package week1.day2;

public class Car {
	
	public void carBrand() {
		System.out.println("Audi");
	}
	
	
	public String carColor() {
		
		return "white";
		
	}
	
	public int engineNum(int a) {
		return a;
	}
	
	public int sub(int b, int c) {
		
		return  b-c;
		
	}
	public int mul(int d, int e) {
		
		return  d*e;
		
	}
	public int div(int f, int g) {
		
		return  f/g;
		
	}
	
	
	

	public static void main(String[] args) {
		
		Car c = new Car();
		c.carBrand();
		String carColor = c.carColor();
		System.out.println(carColor);
		int engineNum = c.engineNum(229333);
		System.out.println(engineNum);
		int sub = c.sub(22, 3333);
		System.out.println(sub);
		int mul = c.mul(2, 3);
		System.out.println(mul);
		int divi = c.div(4, 2);
		System.out.println(divi);

	}

}
