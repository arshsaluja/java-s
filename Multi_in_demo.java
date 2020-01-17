//multi level inheritance
class A
{int a;
void print()
{
System.out.println(a);
}
}
class B extends A
{int b;
void display()
{
System.out.println(b);
}
}
class C extends B
{int c;
void show()
{
System.out.println(c);
}
}
public class Multi_in_demo
{
public static void main(String args[])
{
A aobj =new A();
aobj.a=100;
aobj.print();
B bobj =new B();
bobj.b=10;
bobj.a=20;
bobj.display();
bobj.print();
C cobj =new C();
cobj.c=1;
cobj.a=2;
cobj.b=3;
cobj.display();
cobj.print();
cobj.show();

}
}
