package abstractFactory;


public interface AbstractFactory {
	AbstractBag createBag();

	AbstractBox createBox();

	AbstractWrap createWrap();
}
