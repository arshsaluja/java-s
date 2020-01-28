//divide without using divide operator
import java.util.*;
class Div
{
	public static void main(String args[])
	{
		int s=0;
		int result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter one no");
		int a=sc.nextInt();
		System.out.println("enter second no");
		int b=sc.nextInt();
		s=a+b;
		while(s>b)
		{
			result++;
                        s=s-b;
		}
		System.out.println("result is ");
		System.out.println(result);

	}
}
