import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MemoizationTest {
	
	public static void main(String[] args) {

		System.out.println("\n\n\nmemoization");
		//create the function you want to pass as a parameter
		Function<Integer, Integer> squareFunction = x -> {
			System.out.println("In function");
			return x * x;
			};
		
		Function<Integer, Integer> memoizationFunction = Memoizer.memoize(squareFunction);
		
		System.out.println(memoizationFunction.apply(2));
		System.out.println(memoizationFunction.apply(2));
		System.out.println(memoizationFunction.apply(2));
	}
	
	private static Integer doComputeExpensiveSquare(Integer input) {
		System.out.println("Computing square");
		return 2 * input;
	}

	private final Map<Integer, Integer> memoizationCache = new HashMap<>();

	public Integer computeExpensiveSquare(Integer input) {
		if (!memoizationCache.containsKey(input)) {
			memoizationCache.put(input, doComputeExpensiveSquare(input));
		}
		return memoizationCache.get(input);
	}
	
	

}
