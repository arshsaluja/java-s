import java.util.*;
class P2
{
public static void main(String args[])
{
Scanner sc =new Scanner (System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}
