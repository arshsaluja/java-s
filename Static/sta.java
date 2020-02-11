//non-static variable roll cannot be referenced from a static context
//this program will show an error
class sta
{
int roll=10;
public static void main(String args[])
{
	//int roll=10;
	//this will not show an error
System.out.println(roll);
}
}
