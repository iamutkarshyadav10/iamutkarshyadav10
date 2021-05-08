import java.util.*;

class For
 {
      public static void main(String args [])
    {
      Scanner sc=new Scanner (System.in);
      System.out.print("Enter a no.");
      int a= sc.nextInt();
      for(int i=1; i<=10; i++)
     {
       int c= a*i;
       System.out.println(a + "*" + i + "=" + c);
     }
    }
 }

