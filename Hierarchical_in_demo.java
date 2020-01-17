class A
{
//int a;
void print(int a)
{
System.out.println(a);
}
}
class B extends A
{
//int b;
void display(int b)
{
System.out.println(b);
}
}
class C extends A
{
//int c;
void show(int c)
{
System.out.println(c);
}
}
public class Hierarchical_in_demo
{
public static void main(String args[])
{
A aobj =new A();
//aobj.a=100;
aobj.print(100);
B bobj =new B();
//bobj.b=10;
//bobj.a=20;
bobj.display(10);
bobj.print(20);
C cobj =new C();
//cobj.c=1;
//cobj.a=2;
cobj.print(2);
cobj.show(1);
}
}
