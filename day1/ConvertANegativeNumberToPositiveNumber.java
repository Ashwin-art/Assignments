package week1.day1;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int number = -10;

		if(number < 0) {
			number = -number;
			System.out.println("No longer negative " +number);
		}else {
			System.out.println("Already Positive");
		}

	}

}
