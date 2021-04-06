package deepshallow;

public class ClonableCat implements Cloneable{
	private String name;
	private Age age;		// Cloneable을 사용해도 객체의 레퍼런스 멤버변수는 얕은 복사가 이루어짐
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(Age age) {
		this.age = age;
	}
	
	public Age getAge() {
		return age;
	}
	
	public ClonableCat copy() throws CloneNotSupportedException{
		ClonableCat ret = (ClonableCat)this.clone();
		ret.setAge(new Age(this.age.getYear(), this.age.getValue())); 
		
		return ret;
	}
}
