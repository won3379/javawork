package polymorphism.animals;

class Animal{
	// public Animal() {} 기본생성자
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 날아다녀요");
	}
}
class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 뛰어다닌다");
	}
}
public class AnimalTest {

	//move animal() 정의 -매개변수의 다형성
	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		//AnimalTest aTest 객체 생성
		AnimalTest aTest = new AnimalTest();
		
		//Animal 타입으로 객체 생성
		Animal human = new Human();
		Animal eagle = new Eagle();
		Animal tiger = new Tiger();
		
		//moveAnimal(호출)
		aTest.moveAnimal(human);  //Animal animal new Human
		aTest.moveAnimal(eagle);  
		aTest.moveAnimal(tiger);  

	}

}
