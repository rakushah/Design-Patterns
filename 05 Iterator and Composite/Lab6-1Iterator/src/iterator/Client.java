package iterator;

public class Client {
	public static void main(String[] args) {
		
		String[][] names = new String[][]{
			{"-","Shyam","Hari"},
			{"Sita","-","-"},
			{"Mata","Pita","Neta"}
			
		};
		Aggregate repo = new NameRepository(names);
		Iterator iterator = repo.getIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
