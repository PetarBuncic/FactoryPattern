package factorybilder;

public class FactoryPatternTest {
		
	public static void main (String [] args) {
		ShapeFactory sf=new ShapeFactory(); 
			
		Shape shape=sf.getShape("Circle");
		
		shape.draw();
	}
}
