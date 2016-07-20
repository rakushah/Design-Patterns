package receiver;


public class Square implements Shape{
	private int dim,scaleBy,moveBy=0;
	private Direction dic;

	@Override
	public void create(int dimn) {
		this.dim=dimn;
		System.out.println("Square is created of size : "+dimn+" * "+dimn);
		createSquare(dim);
	}

	@Override
	public void scales(int scaleBy) {
		System.out.println("Square is scaled  by "+scaleBy);
		this.scaleBy=scaleBy;
		dim=dim*scaleBy;
		createSquare(dim);
	}

	@Override
	public void move(int moveBy, Direction dic) {
		
		this.dic=dic;
		System.out.println("Square is moved "+dic+" by "+moveBy);
		switch(dic){
		case Right:
			this.moveBy=moveBy;
			createSquare(dim);
			break;
		case Left:
			this.moveBy=this.moveBy-moveBy;
			createSquare(dim);
			break;
		}
	}

	@Override
	public void remove() {
		System.out.println("Square is removed ");

		
	}
	void createSquare(int dim){
		for(int row=0;row<dim;row++)
		{
			for(int column=0;column<dim;column++){
				if(column==0)
					for(int pos=0;pos<moveBy;pos++){
						System.out.print("\t");
					}
				if (row==0||row==dim-1||column==0||column==dim-1) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	@Override
	public void unscale(int scaleBy) {
		dim=dim/scaleBy;
		System.out.println("Square is unscaled  by "+scaleBy);
		createSquare(dim);
	}

}
