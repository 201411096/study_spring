package deepshallow;

public class Main2 {
	public static void main(String[] args) throws CloneNotSupportedException{
		ClonableCat navi = new ClonableCat();
		navi.setName("navi");
		navi.setAge(new Age(2018, 3));
		
		ClonableCat yo = navi.copy();		
		yo.setName("yo");
		yo.getAge().setYear(2011);
		yo.getAge().setValue(10);
		
		System.out.println(System.identityHashCode(yo));
		System.out.println(System.identityHashCode(navi));
		
		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
	}
}
