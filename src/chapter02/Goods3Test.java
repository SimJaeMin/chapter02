package chapter02;

public class Goods3Test {
	public static void main(String args[]){
//	Goods3 g= new Goods3();
//	g.setName("Nikon");
//	g.setPrice(1234);
//	g.setCountSold(1000);
//	g.setCountStock(141);
	
		//위의 코드대신 생성자로 초기화
	Goods3 g2 =new Goods3("Nikon",12345123,41234123,20);
	Goods3 g=new Goods3();
	System.out.println(g);
	System.out.println(g2);
	
	

}
}
