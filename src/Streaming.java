import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Streaming {
	
	public static void main(String[] args) {
		int[] numbers = {3,6,8,8,4,6,3,3,5,6,9,4,3,6};
		
		//to make them distinct I'll use a Set to help me.
		Set<Integer> distinctSet = new HashSet<>();
		
		for (int number : numbers) {
			distinctSet.add(number);
		}
		Integer total = 0;
		for (Integer dn : distinctSet) {
			total += dn;
		}
		
		System.out.println(total);
		//now using streams
		IntStream stream = Arrays.stream(numbers);
		Integer total2 = stream.distinct().sum();
		Integer total3 = stream.sum();
		System.out.println(total2);
		System.out.println(total3);
		
		
		
	}

}
