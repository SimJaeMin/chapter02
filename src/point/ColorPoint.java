package point;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y,String color){
		//setX(x);
		//setY(y);
		super(x,y);
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		//super.show();// 부분 재정의 일 경우 부모꺼를 잠깐 호출하고 그 이후 재정의한 코드가 실행
		System.out.println("점 [x= "+getX()+"] 점 [y="+getY()+"] 입니다."+"색깔은 "+color+"입니다.");

	}
	

	

}
