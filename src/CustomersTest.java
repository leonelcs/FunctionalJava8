import java.util.Optional;
import java.util.function.Consumer;

public class CustomersTest {

	public static void main(String[] args) {
		Customer customer1 = new Customer(123, "Sue");
		Customer customer2 = new Customer(456, "Bob");
		Customer customer3 = new Customer(789, "Mary");
		Customer defaultCustomer = new Customer(0, "Default");

		Customers customers = new Customers();
		customers.addCustomer(defaultCustomer.getId(), defaultCustomer);
		customers.addCustomer(customer1.getId(), customer1);
		customers.addCustomer(customer2.getId(), customer2);
		customers.addCustomer(customer3.getId(), customer3);

		int id = 234;
		Customer customer = customers.findCustomerWithID(id);
		// will explode a null point exception
//		if (customer.getName().equals("Mary")) {
//			System.out.println("Processing Mary");
//		}
		// you must treat null value
		if (customer != null) {
			if (customer.getName().equals("Mary")) {
				System.out.println("Processing Mary");
			} else {
				System.out.println(customer);
			}
		} else {
			System.out.println(defaultCustomer);
		}

		Optional<Customer> optionalCustomer = customers.findOptionalCustomerWithID(id);
		if (optionalCustomer.isPresent()) {
			if (optionalCustomer.get().getName().equals("Mary")) {
				System.out.println("Processing Mary");
			} else {
				System.out.println(optionalCustomer.get());
			}
		} else {
			System.out.println(defaultCustomer);
		}
		// if present also accept a Function as parameter becoming more elegant.

		Consumer<Customer> consume = o -> {
			if (o.getName().equals("Mary")) {
				System.out.println("Processing Mary");
			} else {
				System.out.println(optionalCustomer.get());
			}
		};
		Optional<Customer> optionalCustomer2 = customers.findOptionalCustomerWithID(789);
		optionalCustomer2.ifPresent(consume);
		
		if (!optionalCustomer2.isPresent()) {
			System.out.println(defaultCustomer);
		}
	}

}
