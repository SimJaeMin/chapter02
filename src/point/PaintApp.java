package point;
public class PaintApp {
	public static void main(String args[]){
		int x=100;
		int y=200;
		Point pt1=new Point();
		pt1.setX(100);
		pt1.setY(200);
		Point pt2=new Point(x, y);
		pt1.show(false);
		pt1.show(true);
		
	}
}
