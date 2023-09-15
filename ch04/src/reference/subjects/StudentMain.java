package reference.subjects;

public class StudentMain {

	public static void main(String[] args) {
		//std1, std2 생성하기
		/*
		Student std1 = new Student(101, "홍길동");	
		
		//과목 추가
		std1.koreanSubject("국어", 90);
		std1.mathSubject("수학", 83);
		
		//학생 정보 출력
		std1.showStudentInfo();
		std2.showStudentInfo();*/
		//객체 배열
		//객체생성
		Student[] students = {
		 
				new Student(101, "홍길동"),
				new Student(102, "임꺽정"),
				new Student(103, "임상옥")
	};
	//점수 저장
		students[0].koreanSubject("국어", 90);
		students[0].mathSubject("수학", 83);		
		students[1].koreanSubject("국어", 80);
		students[1].mathSubject("수학", 77);		
		students[2].koreanSubject("국어", 95);
		students[2].mathSubject("수학", 90);
		//전체 출력
		for(int i= 0; i< students.length; i++) {
		
		students[0].showStudentInfo();
		}
		System.out.println("====================");
		//향상 for
		for(Student stu : students) {
			stu.showStudentInfo();
		}
	}
	
}
