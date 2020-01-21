//method overridding using super keyword
class animal
{
String color="white";
void eating()
{
System.out.println("Eating.......");
}
}
class dog extends animal
{
String color="black";
void eating()
{
System.out.println("eating ing......");
super.eating();
}
void display()
{
System.out.println(color);
System.out.println(super.color);
}
}
public class Overriding_super_demo
{
public static void main(String args[])
{
dog d=new dog();
d.display();
d.eating();
}
}
