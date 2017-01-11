package person;

public class Student extends Person {
	public Student(String name){
		System.out.println("Student(String) called");
	}
	public Student(){
		//명시를 하지않으면 super(); 가 있는거임 자동으로 기본생성자를 호출한다. super 코드는 맨 처음줄에 와야한다.
		//그 이유는 호출순서가 부모 자식 순이기 때문이다.
		super("심재민");
		System.out.println("Student() called");
	}
	public void test(){
		//부모의 public 속성접근
		name="둘리";
		
		//부모의 protected 속성 접근
		height = 130;
		
		//부모의 default 속성 접근 단 같은 패키지에서만 접근가능하다
		age =30;
		
		//부모의 private 속성 접근
		//weight=20; 에러 private접근은 안됨
		

		
	}
}
