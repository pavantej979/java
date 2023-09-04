//java program to find wether the given number is prime number or not.
import java.util.*;
public class DemoPrimev4 {
    public static void main(String args[]) {
      int s1,s2,s3,i,j,num,flag;
      Scanner sc =new Scanner(System.in);
      System.out.print("Enter n valiue : ");
      s1 =sc.nextInt();
      for(i=2;i<=s1;i++)
      {
                  flag=0;
                  for(j=2;j<i;j++)
                  {
                      if(i%j==0)
                      {
                          flag=1;
                          break;
                      }
                  }
                  if(flag==0)
                  {
                      System.out.println(i+" is Prime number");
                  }
      }
    }
}
