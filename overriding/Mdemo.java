//method overloading
class Mdemo
{
public void addition()
{
System.out.println("no args");
}
public void addition(int i)
{
System.out.println("1 args");
}
public void addition(int i,int j)
{
System.out.println(" two args");
}
public void addition( double i,double j)
{
System.out.println("two doubleargs");
}
public static void main(String args[])
{
Mdemo m= new Mdemo();
m.addition();
m.addition(10);
m.addition(10,20);
m.addition(10.7,20.5);
}
}
