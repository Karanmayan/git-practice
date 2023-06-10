package firstPractice;

public class FirstProgram {
	int a=100;
	int b=200;
	
	public void displayTherResults()
	{
		System.out.println(a==b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		
	}
public static void main(String args[])
{
	FirstProgram output = new FirstProgram();
	output.displayTherResults();
}
}
