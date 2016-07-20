package concreteDecorator;

import component.ListProfiler;
import decorator.ListDecorator;

public class ProfileDecorator extends ListDecorator{

	public ProfileDecorator(ListProfiler decoratedList) {
		super(decoratedList);
	}
	
}
