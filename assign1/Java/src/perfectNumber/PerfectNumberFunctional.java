package perfectNumber;

import java.util.stream.IntStream;

public class PerfectNumberFunctional {
	
	public boolean isPerfect(int number) {
		return number > 1 && 
		  number * 2 == IntStream.rangeClosed(1, number)
                             .filter(divisor -> number % divisor == 0)
                             .sum(); 
	}
}
