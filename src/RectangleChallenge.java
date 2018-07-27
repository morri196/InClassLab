import java.util.ArrayList;

public class RectangleChallenge {

	public static void main(String[] args) {
		//creating our instance 
		Rectangle rectangle1 = new Rectangle(10, 15);
		Rectangle rectangle2 = new Rectangle(5, 5);
		Rectangle rectangle3 = new Rectangle(20, 25);
		
		ArrayList<Rectangle> rectangle = new ArrayList<>();
		
		rectangle.add(rectangle1);
		rectangle.add(rectangle2);
		rectangle.add(rectangle3);
		
		double shapeArea = 0;
		double highest = 0;
		double lowest = 1E9;
		
		for ( int i = 0; i < rectangle.size(); i++) {
			shapeArea = rectangle.get(i).getArea();
			System.out.println("Rectangle area size: " + shapeArea);
			
			if (lowest > rectangle.get(i).getArea()) {
				lowest = rectangle.get(i).getArea();
				
			}
			
			if (highest < rectangle.get(i).getArea()) {
				highest = rectangle.get(i).getArea();
				
			}
			
			
		}
		
		System.out.println("The smallest rectangle is " + lowest);
		System.out.println("The largest rectangle is " + highest);
	}

}
