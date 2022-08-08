package week1.day2;

public class IsPrime {
	
	
	public boolean primeBoolChecker(int number) {
		
		
		if(number <= 1) {
			return false;
		}
		
		for(int i = 2; i < number; i++) {
			
			if(number % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	
	public void primeNumberChecker(int number) {
		
		for(int i = 2; i <= number; i++) {
			if(primeBoolChecker(i)) {
				System.out.println("Prime Number: " +i);
				System.out.println("----------------------------------");
			}
			else if(primeBoolChecker(i) == false){
				System.out.println("Non-Prime Number: " +i);
				System.out.println("----------------------------------");
			}
		}
		
	}
		
	public static void main(String[] args) {
		
		IsPrime isPrime = new IsPrime();
		
		isPrime.primeNumberChecker(50);
		

	}

}
