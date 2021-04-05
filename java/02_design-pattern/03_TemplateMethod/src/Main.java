/*
 * 동작 상의 알고리즘의 프로그램 뼈대를 정의하는 행위 디자인 패턴이다. 
 * 알고리즘의 구조를 변경하지 않고 알고리즘의 특정 단계들을 재정의할 수 있게 해준다.
 */

public class Main {

	public static void main(String[] args) {
		AbstConnectHelper helper = new DefaultConnectHelper();
		
		helper.requestConnection("id pw ...");
	}
}
