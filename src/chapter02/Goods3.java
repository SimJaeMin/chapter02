package chapter02;
//생성자 연습하는 클래스
public class Goods3 {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	Goods3(){};//기본생성자, 기본생성자는 다른 생성자가 있을경우 직접 만들어주어야 한다. 하지만 기본생성자 혼자 있을경우는 컴파일러가 자동으로 만들어낸다.
	Goods3(String name,int price,int countStock,int countSold){
		this.name=name;
		this.price=price;
		this.countStock=countStock;
		this.countSold=countSold;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	@Override//toString을 재정의해준것이다. 기존의 toStirng이 있는데 이걸 해주어서 오바라이드 해줌 object 클래스는 모든 클래스의 상위 클래스로서 상속받음.
	public String toString() {
		return "Goods3 [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getCountStock()=" + getCountStock()
				+ ", getCountSold()=" + getCountSold() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
