package ch05.ex05.case10;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.

//dependency (의존성)
//# 한 클래스나 모듈이 다른 클래스나 모듈에 직접적으로 참조되어 있는 경우
//# A has a B (A에게는 B가 있다.)
public class Main {
	public static void main(String[] args) {
		// 멤버 메소드가 다른 멤버 메소드를 호출할 수 있다.
		Pajama pajama = new Pajama();
		Man man = new Man();
		
		man.strip();
		man.wash();
		man.wear(pajama);
		man.lie();
		
		man.sleep(pajama);
		man.sleep(pajama);
	}
}