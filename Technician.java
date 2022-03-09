
public class Technician extends Staff {
public String techtype;

	public Technician(int a, String n, String add, int p, String pro, String EmpID, String EmpRole, String EmpDept, float Empsal, int Empexp, String techtype) {
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
		this.techtype =  techtype;
		}
	
	public String Maintain(String lab) {
		System.out.println(lab + "maintained");
		return "maintained";
	}
	
	public String Install(String Systemm) {
		System.out.println(Systemm + "installed");
		return "installed";
	}
}
