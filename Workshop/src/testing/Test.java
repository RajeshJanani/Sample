package testing;

public class Test {
// global declaration
	
	Test()
	{
		
	}
	
	Test(int x)
	{
		
	}
	
	public void add()
	{
		int x = 10,b=20,c;
		c=x+b;
		System.out.println(c);
		
	}
	
	public static void sub()
	{
		int x = 10,b=20,c;
		c=x-b;
		System.out.println(c);
	}
	
	public int mul()
	{
		int x = 10,b=20,c;
		c=x*b;
		return c;
	}
	
	public static void main(String[] args) 
	{
		
		
		Test ob = new Test();
		ob.add();
		sub();
		int result = ob.mul();
		System.out.println(result);
			}

}
