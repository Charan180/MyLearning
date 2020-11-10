
public class Maindetail {
	public static void main(String[] args) {
		String a= "N Charan";
		String b= "BhashyamPublicSchool";
		String c= "NarayanaJuniorCollege";
		String d="AUCE(A)";
		String e="DataEncryption";
		int f=432;
		int g=830;
		int h=130;
		int i=72;
		int j=369;
		Detailc myDetailc= new Detailc();
		myDetailc.schoolDetails(a, b, f);
		myDetailc.intercollegeDetails(a, c, g, h);
		myDetailc.collegeDetails(a, d, i, j, e);
	}
}
