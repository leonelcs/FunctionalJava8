
public class SideEffect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nSide effect: \n\n\n ");
		sideEffectTest();
	}
	
	private static void sideEffectTest() {
		Integer[] x = { 2 };

		System.out.println(" without side effects ");
		Integer x1 = withoutSideEffect(x);
		System.out.println("Original value " + x[0]);
		System.out.println("Result value " + x1);
		Integer x2 = withoutSideEffect(x);
		System.out.println("Original value " + x[0]);
		System.out.println("Result value " + x2);

		Integer x3 = withoutSideEffect(x);
		System.out.println("Original value " + x[0]);
		System.out.println("Result value " + x3);

		System.out.println("Now with side effects");

		sideEffect(x);
		System.out.println(x[0]);
		sideEffect(x);
		System.out.println(x[0]);
		sideEffect(x);
		System.out.println(x[0]);

	}

	private static Integer sideEffect(Integer[] x) {
		x[0] = x[0] * 2;
		return x[0];
	}

	private static Integer withoutSideEffect(Integer[] x) {
		Integer aux = x[0];
		aux *= 2;
		return aux;
	}

}
