package ch06.ex03.case01;
//@Override(오버라이드) : 덮어쓴다.
public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.shout();
		dog.shout();
	}
}
