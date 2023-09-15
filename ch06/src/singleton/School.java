package singleton;

public class School {
	private static School instance;
	
	private School() {}
	
	public static School getInstance() {
		if(instance ==null) {
			instance = new School();
		}
		return instance;
	}
		
	public School createCar() {
		School school = new School();
		return school;
			
		}
		
	}