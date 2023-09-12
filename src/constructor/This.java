package constructor;

/*public class This
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Animal a1=new Animal("Cat","Meow-Meow");
		Animal a2=new Animal("Dog","Bow-Bow");
		a1.display();
		a2.display();
	}

}
class Animal
{
	String name;
	String sound;
	Animal(String name,String sound)
	{
		//this is a keyword, We can use refers current class instance members.
		this.name=name;
		this.sound=sound;
	}
	void display()
	{
		System.out.println(name+" "+sound);
	}
}
*/
public class This
{
    public static void main (String[] args)
    {
        Student12 s=new Student12("saisri",1214);
        s.display();
    }
}

class Student12
{
    String name="Praveen";
    long id=1240;
    Student12()
    {
    	
    }
    Student12(String name,long id)
    {
    	this.display();
        this.name=name;
        this.id=id;
    }
    public void display()
    {
        System.out.print(name+" "+id);
    }
}
