class CheckAgeException extends Exception 
{
public String toString()
{
return("Invalid Age");
}
}

class testprg
{
public static void main(String args[]) throws CheckAgeException
{
int age=Integer.parseInt(args[0]);

if (age<18)
{
throw new CheckAgeException();
}
else
{
System.out.println("Valid Age");

}
}
}