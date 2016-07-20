import concreteComponent.ArrayListProfiler;
import concreteComponent.LinkedListProfiler;
import concreteDecorator.ProfileDecorator;
import decorator.ListDecorator;

public class Main {
	public static void main(String[] args) {

		ListDecorator decorator = new ProfileDecorator(new ArrayListProfiler());
		decorator.add("A");

		decorator = new ProfileDecorator(new LinkedListProfiler());
		decorator.add("A");
		decorator.contains("A");

	}

}
