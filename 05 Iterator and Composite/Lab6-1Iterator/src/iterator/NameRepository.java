package iterator;

public class NameRepository implements Aggregate {
	/* private String names[] = { "Rob", "Jon", "Jul", "Lor", "Pat", "Ken" }; */
	private String names[][] ;
	private String temp;
	public NameRepository(String[][] names) {
		this.names=names;
	}
	
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int row, column;

		@Override
		public boolean hasNext() {

			if (row < names.length&&column >= names[row].length ) {
				row++;
				column=0;
							
			}
			if (row < names.length) {
				temp=names[row][column++];
				if (temp.matches("-")) {
					temp="";
				}
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			return temp;
		}

	}

}
