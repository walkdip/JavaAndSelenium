package coreJava;

public class MethodTypes
{
	int x=2;
	static int y=4;
	public void program()
	{
	 System.out.println("my program " );
	 System.out.print("for the \n");
	}
	public  int division()
	{
		int a=100,b=50;
		int c=a/b;
		System.out.println("the result of division is "+c);
		return c;
	}
	public int substraction(int a,int b)
	{
		int c=a-b+y;
		System.out.println("the substraction "+c);
		return c;
	}
	public static void mul()
	{
		int a=4,b=3;
		int c=a*b;
		System.out.println("the multiplication value is "+c);
	
	}
	public static void main(String[] args) 
	{	
		MethodTypes objRef=new MethodTypes();
		objRef.program();
		objRef.substraction(2,3);
		mul();
		int result=objRef.division();
		System.out.print("The output value is "+result);
	}

}
