class testprg
{
public static void main(String args[])
{
int a,b;
try
{
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
}
catch(ArrayIndexOutOfBoundsException ae)
{
a=0;
b=0;
System.out.println("Input value is missing ");
}
catch(NumberFormatException ae)
{
a=0;
b=0;
System.out.println("Input value is invalid ");
}





System.out.println("Addition is "+(a+b));

try
{
System.out.println("Division is "+(a/b));
}
catch(ArithmeticException ae)
{
System.out.println("Denominatar value is zero or input value is incorrect");
}
System.out.println("Multiplication is "+(a*b));
System.out.println("Subtraction is "+(a-b));






}
}