package mediator;

public class PlayerTwo extends Player {

	public PlayerTwo(IReversiMediator mediator) {
		super(mediator);
		color = Cell.WHITE;
	}

	@Override
	public Cell move(int iRow, int jColumn) {
		return mediator.move(this, iRow, jColumn);
	}

}
