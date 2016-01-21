package perfectNumber;

public class PerfectNumberImperative {
	
	public boolean isPerfect(int number) {
		return number > 1 && number * 2 == sumOfFactors(number); 
	}
	
	public int sumOfFactors(int number) {
		int sum = 0;
		
		for(int i = 1; i <= number; i++){
			if(number % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
}
