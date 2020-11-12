package radio;

public class Colorcar extends Carsuper {
	String color1="black";
	void printcolor() {
		System.out.println(color1);
		System.out.println(super.color);
	}
	void color() {
		System.out.println("blue");
	}
	void color1() {
		System.out.println("black");
		super.color();
		
	}
}
