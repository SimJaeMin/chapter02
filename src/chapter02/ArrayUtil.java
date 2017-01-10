package chapter02;

public class ArrayUtil {
	public static double[] intToDouble(int[] source){
		double result[]= new double[source.length];
		for(int i=0;i<source.length;i++){
			result[i]=source[i]; //암시적 캐스팅
		}
		
		return result;
	}
	public static int[] doubleToInt(double[] source){
		int[] result=new int[source.length];
		for(int i=0;i<source.length;i++){
			result[i]=(int)source[i];
		}
		
		return result;
	}
	public static int[] concat(int[]a, int b[]){
		if(a==null||b==null){
			return null;
		}
		else{
	    int index=0;
		int[] result= new int[a.length+b.length];
		for(int i=0;i<a.length;i++,index++){
		result[index]=a[i];	
		}
		for(int i=0;i<b.length;i++,index++){
			result[index]=b[i];
			}
		
		return result;
	}

}
}