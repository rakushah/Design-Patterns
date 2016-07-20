package abstractFactory;

public interface PackagingFactory {

	AbstractBag createBag();

	AbstractBox createBox();

	AbstractWrap createWrap();
}
