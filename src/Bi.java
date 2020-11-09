
public class Bi implements Bike {
	@Override
	public void tyres(String running) {
		System.out.println(running);
	}

	@Override
	public void engine(String twostroke) {
	System.out.println(twostroke);	
	}

	@Override
	public void fuel(String petrol) {
		System.out.println(petrol);
	}

}
