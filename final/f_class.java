//final class- cannot be inheritted
// this program will show an error that final class cannot be inherited
final class base
{
void run()
{
System.out.println("final");
}
}
class bb extends base{
void run()
{
System.out.println("final class cannot be inherited");
}
}
class f_class
{
public static void main(String args[])
{
bb b= new bb();
b.run();
}
}
// this program will only be used if and only if we are (WANT TO)restrcting INHERITANCE property in OOP
