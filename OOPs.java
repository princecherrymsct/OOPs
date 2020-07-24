package oopss;

interface Students          //interface usage
{
    abstract void section();      //abstract method
    abstract int get_rollno();    //abstract method
    abstract String get_name();  //abstract method
}

class Student implements Students
{
    private int rollno=6; 
    private String name="Charan"; //encapsulation 
    public void section()        //overriding method (polymorphism)
    {
        System.out.println("Section A");
    }
    public int get_rollno()
    {
        return rollno;
    }
    public String get_name()
    {
        return name;
    }
}
class OverridingClass extends Student 
{
    public void section()
    {
     System.out.println("overriding am section A");   
    }
}

public class Main
{
	public static void main(String[] args) 
	{
	 Students s=new OverridingClass();
	 s.section();
	 System.out.println("roll no. "+s.get_rollno());
	 System.out.println("name "+s.get_name());
	 
	}
}