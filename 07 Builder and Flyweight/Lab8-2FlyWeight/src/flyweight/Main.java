package flyweight;

public class Main {
	public static void main(String[] args) {
		ConcreteImage image = ImageFactory.getInstance();

		Address address = new Address();
		HealthProfile profile = new HealthProfile();

		Customer customer = new Customer(1, "Anna", "Sue", address, profile, image);
	}
}
