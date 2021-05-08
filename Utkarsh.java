import java.util.*;

class Utkarsh
 {
      public static void main(String args [])
    {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter a no.");
      int a= sc.nextInt();
      for(int i=1; i<=10; i++)
     {
       int c= a*i;
       System.out.println(a + "*" + i + "*" + c);
     }
    }
 }
