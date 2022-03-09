
public class Staff extends Person{
	public String EmpID;
	public String EmpRole;
	public String EmpDept;
	public float Empsal;
	public int Empexp;
	
	public String Attend(String duty) {
		System.out.println(duty + "attended");
		return "attended";
	}
	
	public String getpromotion() {
		System.out.println("gotpromotion");
		return "gotpromotion";
	}
	
	public float getsalary() {
		return Empsal;
	}
}
