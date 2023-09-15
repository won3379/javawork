package reference.subjects;

public class Student {
	//필드
	int studentId;//학번
	String studentName;//이름
	Subject korean; //국어 과목(참조)
	Subject math;
	//생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		korean = new Subject(); //korean 객체 생성
		math = new Subject();
	}
	//국어 과목 추가 메서드 정의
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);	
	}
	
	//수학과목
	public void mathSubject(String name, int score)
		math.setSubjectName(name);
		math.setScorePoint(score);
	
		
		for(int=i=0; i<subjects.length; i++) {
			if(subjects[i] ==null) {//배열요소가 비어있을 때
				subjects[i]=subjects;//배열 체를 저장
				break;
			}
		}
	}
		
	//학생정보출력
	public void showStudentInfo() {
		int total = 0;
		double average;
		int count= 0;
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] !=null) {//배열의 요소 차 있을 때(비어있지 않을때)
				//Subject subject = subjects[i];//객체를 생성하고 출력
				count++
				total+=subjects[i].getScorePoint();
				System.out.println(studentId+"번 학생"+studentName+" 의 "+
				subjects[i].getSubjectName()  +"점수는"+ subjects[i].getScorePoint()
				}
				
			}
		
		average= (double)total / count;// 평균= 총점/ 개수
			System.out.printf("과목의 총점은: %d점입니다.\n",total);
	}
		System.out.println(studentName+ "의" + korean.getSubjectName()+
		"점수는"+ korean.getScorePoint() +"점 입니다.");
		System.out.println(studentName+"의 "+math.getSubjectName());
	}
	//

