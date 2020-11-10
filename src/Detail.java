
public class Detail {
	String name;
	String school;
	String project;
	int marks;
	int labmarks;
	public Detail(String name, String school, int marks){
		this.name=name;
		this.school=school;
		this.marks=marks;
		System.out.println(name+" "+school+" "+marks);
	}
	public Detail(String name, String school,int marks, int labmarks) {
		this.name=name;
		this.school=school;
		this.marks=marks;
		this.labmarks=labmarks;
		System.out.println(name+" "+school+" "+marks+" "+labmarks);
		
	}
	public Detail(String name, String school, int marks, int labmarks, String project) {
		this.name=name;
		this.school=school;
		this.marks=marks;
		this.labmarks=labmarks;
		this.project=project;
		System.out.println(name+" "+school+" "+marks+" "+labmarks+" "+project);
	}
}
