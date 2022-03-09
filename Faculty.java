
public class Faculty extends Staff{
public String Facultyspe;
public String Section;
public int noofstudents;
public String Qualification;

	public Faculty(int a, String n, String add, int p, String pro, String EmpID, String EmpRole, String EmpDept, float Empsal, int Empexp, String Facultyspe, String Section, int noofstudents, String Qualification) {
		aadhar_id = a;
		Name=n;
		Address = add;
		Phone = p;
		Profession = pro;
		this.EmpID=EmpID;
		this.EmpRole= EmpRole;
	    this.EmpDept= EmpDept;
		this.Empsal= Empsal;
		this.Empexp= Empexp; 
		this.Facultyspe = Facultyspe;
		this.Section = Section;
		this.noofstudents = noofstudents;
		this.Qualification= Qualification;}
	
	public String Teach(String course) {
		System.out.println(course + "taught");
		return "taught";	
	}
	
	public String Access(String grade) {
		System.out.println(grade + "accessed");
		return "accessed";	
	}
}
