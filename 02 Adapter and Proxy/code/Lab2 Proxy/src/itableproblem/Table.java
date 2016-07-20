package itableproblem;

public class Table implements ITable{

	@Override
	public int numOfRows() {
		//return the number of rows
		return 0;
	}

	@Override
	public IRow getRow(int rowNum) {
		//return the row
		return null;
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		//add the row
	}

	@Override
	public void modifyRow(int rowNum, IRow row) {
		//modify the row
	}

	@Override
	public void deleteRow(int rowNum) {
		//delete the row
	}

}
