//final variable- no one can change the vale
//this code will show a error
class Ff
{
final  int speed_limit=90;
void run()
{
speed_limit=1000;
System.out.println(speed_limit);
}
public static void main(String args[])
{
Ff obj= new Ff();
obj.run();
}
}
