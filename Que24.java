//Write a Java program to convert a binary number to a Octal number.
 
 class Que24
{
public static void main(String args[])
{
String a="111";

int b= Integer.parseInt(a,2);

System.out.println(Integer.toOctalString(b));
}
}