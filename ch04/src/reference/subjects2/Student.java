package reference.subjects2;

import reference.subjects.Subject;

public class Student {
	private int studentId; //int studentId =0 
	private String studentName;//String studentName=null
	private Subject[] subjects;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects =new Subject[10]; //과목을  저장
		
		
	}
	//과목 추가
	public void addSubject(String name, int score) {
		//과목 객체 생성해서 값(과목이름,점수)을 저장
		Subject subject =new Subject(name, score);
		//subject.setSubjectName(name);
		//subject.setScorePoint(score);
		
		//과목을 배열에 저장
		//subjects[0] = subject;
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] == null) {
				subjects[i]= subject;
				break;
			}
		}		
	}
	//학생 정보 출력
	public void showStudentInfo() {
		int total = 0;// 총점
		double average;//평균
		int count = 0; //개수
		for(int i =0; i<subjects.length; i++) {
			if(subjects[i] !=null) {//배열의 요소 차 있을때(비어있지 않을 때)	
			}
			
			count++;//1씩증가
			total+=subjects[i].getScorePoint();
			System.out.println(studentId+"번 학생: "+studentName+"의"+
					subjects[i].getSubjectName()+"점수는" + subjects[i].getScorePoint()+"점 입니다.");
		}
		
		average =(double)total / count;
		System.out.printf("과목의 총점은 %d점이고,평균은 %.1f입니다.\n", total, average);
	}
}