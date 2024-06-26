package ch06.ex04.case01;
//Super 연습
public class Cat extends Animal {
	private int age;
	
	public Cat(String catName, int age) {
		super(catName);
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.getAnimalName(), this.getAge());
	}
}
