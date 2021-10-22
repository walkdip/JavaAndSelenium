package coreJava;

public class Inheritance extends Myown
{
	public void method()
	{
		System.out.println("my inheritance ");
	}

	public static void main(String[] args)
	{
		Inheritance objRef1=new Inheritance();
		objRef1.method();
		objRef1.simple();
		objRef1.division();
		objRef1.substraction(1, 2);
		NewProgram objRef2= new NewProgram ();
		NewProgram.printMe();

	}

}
