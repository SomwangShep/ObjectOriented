
public class Recursion2 {
	public static void main(String[] args)
	{
		System.out.println("HCF of 8 and 28: " + hcf(8,28));
		System.out.println("Factorial of 5: " + factorial(5));
		System.out.println("3rd Fibonacci NUmber: " + fibonacci(3));
		int numberofDiscs = 3;
		towerofHanoi (numberofDiscs, "A","B","C");
	}

	public static int hcf(int num1, int num2)
	{
		if (num2 == 0)	{	return num1;	}
		else		    {	return hcf(num2,num1 % num2);	}
	}
	
	public static int factorial(int num)
	{
		//5! = 5 * 4!
		if (num <= 1){	return 1;	}
		return num * factorial(num - 1);
	}
	
	public static int fibonacci( int n)
	{
		//Fn = Fn-1 + Fn-2
		if (n == 1)		{	return 1;	}
		else if (n < 1)	{	return 0;	}
		return fibonacci (n-1) + fibonacci(n-2);
	}
	public static void towerofHanoi(int n, String start, String intermediate, String end)
	{
		if (n == 1)
		{
			//move nth disc to the end of pole
			System.out.println("Move " + n + " disc from " + start + " to " + end);
		}
		else
		{
			//move n-1 from start pole to the intermediate pole
			towerofHanoi(n-1, start, end,intermediate);
			//move nth disc to the end pole
			System.out.println("move " + n + " disc from " + start + " to " + end);
			//move n-1 disc from intermediate pole to end pole
			towerofHanoi(n-1,intermediate, start, end);
		}
	}
}
