package person;

public class PesronTest {
	public static void main(String args[]){
		Student s = new Student();
		Student s2 = new Student("심재 민");
		//Person s3= new Student();
		Person p =s;// student 가 person 으로 업 캐스팅, 업캐스팅은 명시적으로 안해주어도된다. 큰 곳에서 작은곳으로가기때문이다.
		Student s3= (Student)p; // person 이 student로 작은거에서 큰곳으로 명시적으로 해주어야한다. 작은곳에서 큰곳으로
		
		//래퍼런스 변수   p로 객체의 기능을 사용하다가...
		//갑자기 자식의 메소드를 사용해야되는 경우 
		//((Student)p).test();
	}

}
