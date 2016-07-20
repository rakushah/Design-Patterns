package client;

import java.util.LinkedList;

import command.Command;
import concreteCommand.CreateSquare;
import concreteCommand.MoveSquare;
import concreteCommand.ScaleSquare;
import invoker.Invoker;
import receiver.Shape;
import receiver.Square;

public class Client {

	public static void main(String[] args){
		Shape square=new Square();
		Command create=new CreateSquare(square);
		Command move=new MoveSquare(square);
		Command scale=new ScaleSquare(square);
		//--Square 5*5 is created --//
		Invoker invoker=new Invoker();
		invoker.execute(create);
		//--Square is moved right by 2 tabs--//
		invoker.execute(move);
		//invoker.undo(move);
		//---Square is scaled 2 times--//
		invoker.execute(scale);
		invoker.undo();
		invoker.undo();
		invoker.undo();
		
	}
}
