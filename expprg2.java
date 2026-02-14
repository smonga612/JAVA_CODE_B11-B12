class testprg
{
public static void main(String args[])
{
try
{
throw new ArithmeticException();
}
catch(ArithmeticException ae)
{
System.out.println("Error");
}
finally
{
System.out.println("End of code");

}

}
}