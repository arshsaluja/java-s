class P
{
void run()
{
System.out.println("Parent ");
}
}
class s extends P
{
void run()
{
	//super.run();
System.out.println("child  ");
}
}
class pa
{
public static void main(String args[])
{
P p=new P();
p.run();
s e= new s();
e.run();

}
}
