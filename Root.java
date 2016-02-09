import java.lang.Math;

public class Root 
{
	Root(String t,int n)
	{
		if(t.equals("S"))			
			System.out.println("Square Root of " + n + " is : " + Math.sqrt(n));
		else
		{
		if(t.equals("C"))	
			System.out.println("Cube Root of " + n + " is : " +  Math.cbrt(n));
		}
	}
	
}