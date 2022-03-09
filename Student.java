
public class Student extends Person {
public String Student_ID;
public String Major;
public int year;
public int semester;
public String College;
public int grade;
	
	
	public String Register(String course) {
		System.out.println(course + "registered");
		return "registered";	
	}
	
	public int getgrade(String course) {
		System.out.println(course + "grades");
		return grade;	
	}
	
	public String Attend(String classs) {
		System.out.println(classs + "attended");
		return "attended";
	}
	
	public String learn() {
		System.out.println("learnt");
		return "learnt";	
	}
	
	
	
}
