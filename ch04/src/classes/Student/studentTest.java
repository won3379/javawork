package classes.Student;

public class studentTest {

	public static void main(String[] args) {
		// Student 객체(변수) 생성
		//메모리 영역(new를 하면heap 영역 사용)
		// 점 연산자로 접근함 
		Student student1=new Student();
		student1.name ="홍길동";
		student1.studentId =101;
		student1.grade=1;
		student1.showStudentInfo();
		/*
		System.out.println("학생이름:"+student1.name);
		System.out.println("학번:"+student1.studentId);
		System.out.println("학년:"+student1.grade);*/
		System.out.println("===================");
		
		Student student2 =new Student();
		student2.name="서정원";
		student2.studentId=102;
		student2.grade=2;
		student2.showStudentInfo();
		/*
		System.out.println("학생이름:"+student2.name);
		System.out.println("학번:"+student2.studentId);
		System.out.println("학년:"+student2.grade);
		*/
	}
}
