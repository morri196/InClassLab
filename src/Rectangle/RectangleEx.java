package Rectangle;

public class RectangleEx {

public static void main(String[] args) {
	Rectangle room = new Rectangle(15, 11);
	Rectangle room2 = new Rectangle(22, 15);
	
	// Set
	// NOT THIS --> earth.radius = 8;
	room.setLength(10);//re-setting the length from 15 to 10
	
	// instance methods must be called on the objects
	System.out.println("room1 Area: " + room.getArea());
	System.out.println("room2 Area: " + room2.getArea());

	
	// static methods can be called on the class
	System.out.println(Rectangle.getShape());
	
	System.out.println(room);
	System.out.println(room2);
}

}
