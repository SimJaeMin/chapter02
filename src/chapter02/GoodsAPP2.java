package chapter02;
public class GoodsAPP2 {
	public static void main(String args[]){
	Goods2 camera2 = new Goods2();
	camera2.setName("Nikon");
	System.out.println(camera2.getName());
	//camera.price=-1; 객체 변수에 바로접근하면 잘못 된 데이터를 세팅할수 있는 가능성이잇다.
	camera2.setPrice(-1);
	System.out.println(camera2.getPrice());
	
	//static 변수 테스트
	Goods2 good1 = new Goods2();
	System.out.println("Goods2.countOfGoods");
	Goods2 good2 = new Goods2();
	System.out.println("Goods2.countOfGoods");
	Goods2 good3 = new Goods2();
	System.out.println("Goods2.countOfGoods");
	System.out.println(Goods2.countOfGoods);
	
	good3.setName("심재민");
	//메소드 호출
	good3.showInfo();
}
}