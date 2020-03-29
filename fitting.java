//You are given a rectangle of length a and width b. You are required to determine a circle that contains the maximum circumference that fits inside the rectangle. This type of circle is called a big circle. Your task is to determine the maximum number of big circles that can fit inside the rectangle. 
//Input format
//First line: An integer t denoting the number of test cases
//First line of each test case: Integers a and b
//Output format
//For each test case, print the answer on a new line denoting the maximum number of big circles that can fit in the provided rectangle.  
import java.util.Scanner;
public class fitting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
			int c2=0;
           Long count=new Long(c2);
            Long b=sc.nextLong();
            Long c=sc.nextLong();
			int t1=0;
			int f1=0;
			Long t=new Long(t1);
			Long f=new Long(f1);
            if(b<=c)
			{
			t=b;
			f=c;
			}
			else if(c<=b)
			{
			t=c;
			f=b;
			}
			count=f/t;
            
            System.out.println(count);
        }

    }
}

