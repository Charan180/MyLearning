
public class MyClass {
	String name;
	String place;
	int age;
	public MyClass(String name,String place) {
		this.name = name;
		this.place = place;
	}
	public MyClass() {
		System.out.println("constructor without arguments invoked");
	}
	
	public MyClass(String name, int age, String place) {
		this.name = name;
		this.place = place;
		this.age = age;
	}
	
	
	public void getName() {
		System.out.println(name+" "+place);
	}
}
