package tamplatelab;

public class MirrorClass extends Tamplate{
	
	private SymmetryType type;
	private String[][] input;
	public MirrorClass(SymmetryType type,String[][] input){
		this.type=type;
		this.input=input;
	}
	@Override
	public SymmetryType getSymmetryType() {
		return type;
	}

	@Override
	public String[][] getInputLetter() {
		return input;
	}
	
	public static void main(String[] args){
		MirrorClass m=new MirrorClass(SymmetryType.HORIZONTAL,Constants.charC);
		m.print();
	}
}
