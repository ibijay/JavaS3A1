import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class RootMain{
public static void main(String[] args)
{
	int num = 0;
	String typ="";
	BufferedReader ins = new BufferedReader(new InputStreamReader(System.in));
	try {
		System.out.print("Square/Cube Type S or C.");
		typ = ins.readLine();
		System.out.print("Enter the no.");
		num = Integer.parseInt(ins.readLine());
	} catch (IOException e) 
	{
	}
	Root rt = new Root(typ, num); 
}
}