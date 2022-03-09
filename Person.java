
public abstract class Person {
public int aadhar_id;
public String Name;
public String Address;
public int Phone;
public String Profession;



public String Register(int UID) {
	aadhar_id = UID;
	return "Registered";
}

public String performduty(String duty) 
{
System.out.println(duty + "performed");
return "performed";
}

public String include(String service) {
	System.out.println(service + "included");
	return "included";	
}

public String like(String item) {
	System.out.println(item + "liked");
	return "liked";	
}

}
