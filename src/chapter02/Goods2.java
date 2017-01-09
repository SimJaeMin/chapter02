package chapter02;

public class Goods2 {
	public Goods2(){    //기본생성자
	System.out.println("기본생성자호출");	
    countOfGoods++;
	}
	public static int countOfGoods;
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	public String getName() {
		return name;
	}
	// 리턴값이 없고 파라미터가 있는 메소드
	public void setName(String name) {
		this.name = name;
	}
	//리턴값이 있고 파라미터가 없는 메소드;
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
// 리턴값도 없고 파라미터도 없는 메소드
	public void showInfo(){
	System.out.println("name :"+name+ ","+"price :"+price+"count :"+countSold);
	}
	
	}
