package reference.subjects2;

public class StudentTest {

	public static void main(String[] args) {
		Student kim =new Student(101, "김대한");
		Student park =new Student(102, "박민국");
		
		//과목 추가 
		kim.addSubject("국어" ,90);
		kim.addSubject("수학" ,80);
		kim.addSubject("과학", 78);
		kim.showStudentInfo();
		park.addSubject("코딩", 95);
		park.addSubject("java", 95);
		
		kim.showStudentInfo();
		System.out.println("*****************************************");
		park.showStudentInfo();
		
		
	}
	
}
