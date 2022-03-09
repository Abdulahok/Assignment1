
public class PG_Student extends Student{
	public String Rollno;
	public String Specialization;
	public PG_Student(int a, String n, String add, int p, String pro, String Student_ID, String Major, int year,  int semester,  String College, int grade, String Rollno, String Specialization) {
		aadhar_id = a;
		Name=n;
		Address = add;
		Phone = p;
		Profession = pro;
		this.Student_ID = Student_ID;
		this.Major = Major;
		this.year = year;
		this.semester = semester;
	    this.College = College;
		this.grade = grade;
		this.Rollno = Rollno;
		this.Specialization = Specialization;
	}
	
	public void Submitthesis() {
		System.out.println("Thesis submitted");
	}
}
