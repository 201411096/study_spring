package deepshallow;

public class Main {
	public static void main(String[] args) {
		Cat navi = new Cat();
		navi.setName("navi");
		
		Cat yo = navi;		// 주소값만 복사한 얕은 복사
		yo.setName("yo");
		System.out.println(System.identityHashCode(yo));
		System.out.println(System.identityHashCode(navi));
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
	}
}
