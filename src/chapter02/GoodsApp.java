package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		//camera.name="nikon";// private은 외부에서 접근안됨
		camera.price=4000000;//protected는 같은 패키지에서 접근가능 + 자식클래스에서도 접근가능
		
		camera.countSold=100;
		camera.countStock=50; // public은 외부에서도 가능하다.
		
		
		
	}

}
