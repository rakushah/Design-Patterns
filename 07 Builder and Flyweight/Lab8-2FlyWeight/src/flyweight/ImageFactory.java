package flyweight;

public class ImageFactory {
	static ConcreteImage byGraphic = new ConcreteImage(new Map()); // create
																	// Dump data

	public static ConcreteImage getInstance() {
		return byGraphic;
	}

}
