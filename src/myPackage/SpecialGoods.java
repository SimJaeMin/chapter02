package myPackage;
import chapter02.Goods;
public class SpecialGoods extends Goods{
	void text(){
		//name ="canon "; private는 자식에서도 접근할수 없다. 자식도 외부이다.
	
		price =20000; //접근가능하다. protected는 자식에서 접근할수 있다.
		countStock=20;//public은 자식에서도 접근가능하다.
	}

}
