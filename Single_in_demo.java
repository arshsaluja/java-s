//single inheritance

class A
{
int a;
void display()
{
System.out.println(a);
}
}
class B extends A
{
int b;
void print()
{
System.out.println(b);
}
}
public class Single_in_demo
{
public static void main(String args[])
{
A aobj=new A();
aobj.a=100;
aobj.display();
B bobj= new B();
bobj.a=10;
bobj.b=20;
bobj.display();
bobj.print();
}
}
