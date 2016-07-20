package tamplatelab;

public abstract class Tamplate {

	public final void print() {
		SymmetryType type = getSymmetryType();
		String[][] inputLetter = getInputLetter();
		String[][] result = reconstructLetter(type, inputLetter);

		for (int row = 0; row < 14; row++) {
			for (int column = 0; column < 9; column++) {
				System.out.print(result[row][column]);
			}
			System.out.println();
		}

	}

	public abstract SymmetryType getSymmetryType();

	public abstract String[][] getInputLetter();

	private String[][] reconstructLetter(SymmetryType type, String[][] input) {
		String result[][] = new String[20][9];
		switch (type) {
		case HORIZONTAL:
			int minusRowNum = 1;
			for (int row = 0; row < 14; row++) {
				for (int column = 0; column < 9; column++) {
					if (row >= 8) {
						result[row][column] = input[row - minusRowNum][column];
					} else {
						result[row][column] = input[row][column];
					}
				}
				if (row>=8) {
					minusRowNum+=2;		
				}
						
			}
			break;
		case VERTICAL:

			for (int row = 0; row < 14; row++) {
				int minusColNum = 1;
				for (int column = 0; column < 9; column++) {
					if (column >= 5) {
						result[row][column] = input[row][column - minusColNum];
						minusColNum += 2;
					} else {
						result[row][column] = input[row][column];
					}
				}
			}

			break;
		case NONE:
			return input;
		}
		return result;

	}
}
