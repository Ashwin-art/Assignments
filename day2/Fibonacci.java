package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int firstNum = 0, secNum = 1, sum = 0;
		
		System.out.print(firstNum+" "+secNum);
		
		for(int i = 2; i <= 10; i++) {
			
			sum = firstNum + secNum;
			System.out.print(" "+sum);
			firstNum = secNum;
			secNum = sum;
			
		}

	}

}
