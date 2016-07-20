package concreteCommand;

import command.Command;
import receiver.Direction;
import receiver.Shape;

public class MoveSquare implements Command{

	private Shape shape;
	
	public MoveSquare(Shape shape){
		this.shape=shape;
	}
	@Override
	public void execute() {
		shape.move(2,Direction.Right);
	}

	@Override
	public void undo() {
		shape.move(2,Direction.Left);
	}


}
