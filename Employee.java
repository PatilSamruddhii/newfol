public class Employee
{
	int id;
	String Name;
    String department;
	
public Employee()	
{
	
	
}

public Employee(int id, String Name, String department)
{
	this.id=id;
	this.Name=Name;
	this.department=department;
}
public static void main(String[]args)
{
	Employee e1 = new Employee();
	e1.id = 10;
	e1.Name="Hari";
	e1.department="IT";
     
    System.out.println(e1.id);
    System.out.println(e1.Name);
	System.out.println(e1.department);

    Employee e2 = new Employee(20, "sham", "HR");
    System.out.println(e2.id);
	System.out.println(e2.Name);
	System.out.println(e2.department);
	
	
	
}
}