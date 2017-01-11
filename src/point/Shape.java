package point;

public abstract class Shape {
	public Shape(){}
	public Shape(String color){
		this.color=color;
	}
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
