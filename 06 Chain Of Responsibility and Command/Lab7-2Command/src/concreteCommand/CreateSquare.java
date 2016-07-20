package concreteCommand;

import command.Command;
import receiver.Shape;

public class CreateSquare implements Command{

	private Shape shape;
	
	public CreateSquare(Shape shape){
		this.shape=shape;
	}
	@Override
	public void execute() {
		shape.create(5);
	}

	@Override
	public void undo() {
		shape.remove();
	}

}
