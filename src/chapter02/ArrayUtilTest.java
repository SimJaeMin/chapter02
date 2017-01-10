package chapter02;

public class ArrayUtilTest {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = {50,60,70,80,90};
		double[] d = ArrayUtil.intToDouble(a);
		for (double v : d) {
			System.out.println(v);
		}
		double[] b1={10.0,20.0,30.0,40.0,50.0};
		int[] a1=ArrayUtil.doubleToInt(b1);//static 메소드가 외부에있으면 외부클래스명으로 호출 가능하고 내부에있으면 그냥 가능
		for(int i:a1){
			System.out.println(i);
		}
		int []a3=ArrayUtil.concat(a, b);
		for(int i:a3){
			System.out.println(i);
		}
	}
}
