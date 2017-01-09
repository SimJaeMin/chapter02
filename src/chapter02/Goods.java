package chapter02;

public class Goods {
	private String name;
	protected int price;
	public int countStock;
	int countSold; //default 접근제어 public,protected, private 를 적어주지 않으면 default 가 된다. -> 같은패키지에서만 접근가능
	void setName(String name){
		this.name=name;	
	}
	String getName(){
		return name;
	}
	

}
