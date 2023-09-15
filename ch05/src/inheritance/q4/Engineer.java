package inheritance.q4;

	public class Engineer extends Employee {
		/*오류 원인 -Employee의 생성자를 상속받지 않음
		 * 결함 조치 -super()를 사용하여 생성자를 상속받음
		 */
		private String skillset;
		
		public Engineer(String name) {
			super(name);
		}
		public String getSkillSet() {
			return skillset;
		}
		
		public void setSkillSet(String skillset) {
			this.skillset = skillset;	
		}
		
		
	}

