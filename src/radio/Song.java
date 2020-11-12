package radio;
public class Song {
public void playMusic1() {
	System.out.println("Play!");
}
private static int playMusic() {
	System.out.println("Music!");
	return 0;
}
public static void main(String[]tracks) {
	new Song().playMusic1();
	
}
}
