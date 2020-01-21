//method overridding
class bank
{
double display()
{
return 10.3;
}
}
class icici extends bank
{
double display()
{
return 12.4;
}
} 
class Sbi extends bank
{
double display()
{
return 88.0;
}
}
public class Overring_Demo
{
public static void main(String args[])
{
student obj= new student();
System.out.println(obj.display());
}
}
