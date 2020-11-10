public class Milk extends Buffalo {
void run() {
	System.out.println("gives milk");
}
	public static void main(String[] args) {
	Buffalo obj= new Milk();	
	obj.run();
	}
}
