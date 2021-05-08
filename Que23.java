//Write a Java program to convert a binary number to hexadecimal number.

class Que23
{
public static void main(String args[])
{
String a="1101";

int b= Integer.parseInt(a,2);

System.out.println(Integer.toHexString(b));
}
}