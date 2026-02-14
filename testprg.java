class A
{
int a;
A(int a)
{
this.a=a;
}
int getA()
{
return(a);
}

}

class testprg
{
public static void main(String args[])
{

A a1=new A(3);
System.out.println("Value of a is "+a1.getA());

}









}