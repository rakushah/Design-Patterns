package visitor;

public class Main {

	public static void main(String[] args){

		Root root = DataMaker.getRoot();
		
		DisplayNodeVisitor visitor = new DisplayNodeVisitor();
		
		root.accept(visitor);
		
		visitor.printVisitResults();
				
	}
}
