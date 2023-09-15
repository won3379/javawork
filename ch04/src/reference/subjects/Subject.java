package reference.subjects;

public class Subject {
	//필드
	private String subjectName; //과목 이름	
	private int scorePoint;     //과목 점수
	
	public Subject() {}
	
	//getter, setter
	//과목이름 입력
	
	public Subject(String name, int score) {
		// TODO Auto-generated constructor stub
	}
	public Subject(String subjectName, int score) {
		this.subjectName =subjectName;
		this.scorePoint = scorePoint;
	}
	//getter , setter
	//과목이름 입력
	public String getSubjectName() {
		return subjectName;
	}
	//점수 입력
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	//점수 출력
	public int getScorePoint() {
		return scorePoint;
		
	}
	
}
