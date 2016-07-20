package invoker;

import java.util.Stack;

import command.Command;

public class Invoker {
	private Stack<Command> commandsExecuted = new Stack<Command>();

	public void execute(Command theCommand) {

		theCommand.execute();
		commandsExecuted.push(theCommand);

	}

	// Now the remote can undo past commands

	public void undo() {
		commandsExecuted.pop().undo();

	}
}
