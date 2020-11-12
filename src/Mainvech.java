public class Mainvech {

	public static void main(String[] args) {
		Vechile v;
		v= new Auto();
		v.runs();
	int run =	v.run(10);
	System.out.println(run);
		v= new Car();
		v.runs();
		v.run(40);
		v= new Motorbike();
		v.runs();
		v.run(20);

	}

}
