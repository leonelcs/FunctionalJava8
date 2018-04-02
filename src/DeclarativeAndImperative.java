
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class DeclarativeAndImperative {

	public static void main(String[] args) {

		// simplest way to declare a sequential array
		String[] arr = { "ABN", "ING", "Coca-cola", "Yacht", "Facebook", "Google", "Yahoo", "Apple" };

		System.out.println("Imperative way: \n\n\n ");
		// imperative way
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				// Remember that use bubble sort to ordinate a string array is a terrible idea
				// The O(n) complexity will O(n*3)
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					// swap temp and arr[i]
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		System.out.println("\nDeclarative way way: \n\n\n ");

		// declarative way
		List<String> listFromArray = Arrays.asList(arr);
		listFromArray.stream().sorted().forEach(System.out::println);
		
	}

}
