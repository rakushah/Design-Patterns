package concreteCommand;

import command.Command;
import receiver.Shape;

public class ScaleSquare implements Command{

	private Shape shape;
	
	public ScaleSquare(Shape shape){
		this.shape=shape;
	}
	@Override
	public void execute() {
		shape.scales(2);
	}

	@Override
	public void undo() {
		shape.unscale(2);
	}

}
