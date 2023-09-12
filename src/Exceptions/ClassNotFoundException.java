package Exceptions;

public class ClassNotFoundException 
{
	public static void main(String[] args)throws Exception 
	{
	       Class cls = Class.forName("AAAA");
	   }

}
class AA
{


}

/*
IN Java applications, if we want to load a particular class bytecode to the memory 
then we have to use the Class.forName(“ClassName”) method. IN this case , JVM will 
search for the provided class at current location, at java predefined library and at 
the locations referred by “classpath” environment variable,in all the above locations 
if the required class does not exist then JVM will raise an exception like java.lang.ClassNotFoundException.
*/