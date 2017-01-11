package point;
public class Point implements Drawable{
	private int x;
	private int y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	Point(){};
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void show(){
		System.out.println("점 [x= "+x+"] 점 [y="+y+"] 입니다.");
	}
	public void show(boolean visible){
		if(visible==true){
		show();//쇼를 복사해서 써도 되지만 그렇게되면 중복이됨, 중복은방징 코드를다시 짜야하면 양쪽다 코쳐줘야됨
		}
		else{
			System.out.println("점이 없어졌습니다.");
		}
	}
	@Override
	public void draw() {
		show();
	}
	}
