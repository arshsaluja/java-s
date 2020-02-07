//method overriding
class Rbi
{
void roi()
{
System.out.println("8%");
}
}
class sbi extends Rbi
{
void roi()
{
System.out.println("4%");
}
}
class pnb extends Rbi
{
void roi()
{
System.out.println("5%");
}
}
class bank
{
public static void main(String args[])
{
Rbi r= new Rbi();
r.roi();
sbi s= new sbi();
s.roi();
pnb p= new pnb();
p.roi();
}
}
