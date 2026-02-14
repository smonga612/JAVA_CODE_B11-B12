class account implements Runnable
{
int balance =1000;
public void run()
{
Thread t=Thread.currentThread();
String name=t.getName();
withdraw(name);
}
synchronized void withdraw(String name)
{
System.out.println("Login by "+name);
if (balance==1000)
{
System.out.println("Transaction done by "+name);
balance=balance-1000;
System.out.println("New Balance is Rs "+balance);
}
else
{
System.out.println("Insufficent Balance for "+name);
}

}
}

class testprg
{
public static void main(String args[])
{
account a1=new account();
Thread atm1=new Thread(a1);
Thread atm2=new Thread(a1);
atm1.start();
atm2.start();
atm1.setName("Rajesh");
atm2.setName("Vishal");



}





}