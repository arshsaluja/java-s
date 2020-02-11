//final method - it cannot be overrriden
//this program will show a error than final method cannot be overridden
class base
{
final void run()
{
System.out.println("final");
}
}
class bb extends base
{

void run()
{
System.out.println("overridden func");
}
}
class f_method 
{
public static void main(String args)
{
bb b= new bb ();
b.run();
}
}
// this program will only be used if and only if we are (WANT TO)restrcting POLYMORPHISM property in OOP
