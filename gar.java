import java.util.Scanner;
class Hello
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
System.out.println("enter a double value");
double d=sc.nextDouble();
System.out.println("enter a character ");
char c=sc.next().charAt(0);
System.out.println("enter a string value");
String s=sc.next();
System.out.println("enter a sentence");
String s1=sc.nextLine();
System.out.println("enter a Boolean values");
Boolean b=sc.nextBoolean();
System.out.println("enter a byte values");
byte b1=sc.nextByte();
System.out.println("enter a long values");
long l=sc.nextLong();
}
}