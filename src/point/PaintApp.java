package point;
public class PaintApp{
	public static void main (String args[]){
		int x=100;
		int y=200;
		Point pt1=new Point();
		pt1.setX(100);
		pt1.setY(200);
		Point pt2=new Point(x, y);
		draw(pt1);
		draw(pt2);
		pt1.show(false);
		pt1.show(true);
		ColorPoint pt3=new ColorPoint(500,500,"red");
		draw(pt3);		
		Rectangle rectangle = new Rectangle();
		draw(rectangle);
		Circle circle = new Circle();
		draw(circle);
		
	}
	public static void draw(Drawable drawable){
		drawable.draw();
	}
}
//	public static void drawShape(Shape shape){
//		shape.draw();
//	}
//	public static void drawPoint(Point point){
//		point.show();
//
//	}
//}
//	public static void drawRectangle(Rectangle rectangle){
//		rectangle.draw();
//	}
//	public static void drawCircle(Circle circle){
//		circle.draw();
//	}
//}
