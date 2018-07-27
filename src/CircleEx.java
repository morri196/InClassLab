import java.util.HashMap;

public class CircleEx {

	public static void main(String[] args) {
		Circle earth = new Circle(5, "blue");
		Circle mercury = new Circle(1, "yellow");
		
		// Set
		// NOT THIS --> earth.radius = 8;
		earth.setRadius(8);
		
		// instance methods must be called on the objects
		System.out.println("Earth A: " + earth.getArea());
		System.out.println("Earth P: " + earth.getPerimeter());
		System.out.println("Earth R: " + earth.getRadius());
		System.out.println("Area of mercury: " + mercury.getArea());

		// static methods can be called on the class
		System.out.println(Circle.getShape());
		
		System.out.println(earth);
		System.out.println(mercury);
		
		HashMap<String, Circle> planets = new HashMap<>();
		planets.put("Earth", earth);
		planets.put("Mercury", mercury);
		
		System.out.println(planets.get("Earth").getArea());
				
	}

}
