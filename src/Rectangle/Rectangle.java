package Rectangle;

public class Rectangle {

		public double length;
		public double width;
		
		// constructor
		public Rectangle(double length) {
			super();
			this.length = length;
		}

		// another constructor
		public Rectangle(double length, double width) {
			super();
			this.length = length;
			this.width = width;
		}
		
		// getter
		public double getLength() {
			return length;
		}
		
		// setter
		public void setLength(double length) {
			this.length = length;
		}
		
		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public static String getShape() {
			return "Rectangle";
		}
		
		public double getwidth() {
			return width;
		}
		
		public double getArea() {
			return length * width;
		}

		@Override
		public String toString() {
			return "Rectangle [length=" + length + ", width=" + width + "]";
		}

		// toString determines what the objects will look like
		// when printed directly to the console.
		//@Override
		//public String toString() {
			//return "Circle [radius=" + radius + ", color=" + color + "]";
		//}
		
}
		
		
		
		
		