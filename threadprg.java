class mythread extends Thread
{
public void run() 
{
for(int i=1;i<=10;i++)
{
System.out.println("Value of i is "+i);
try
{
Thread.sleep(10);
}
catch(InterruptedException ie)
{
}
}
}
}
class mythread1 extends Thread
{
public void run() 
{
for(int j=10;j<=20;j++)
{
System.out.println("Value of j is "+j);
try
{
Thread.sleep(10);
}
catch(InterruptedException ie)
{
}

}
}
}
class testprg
{
public static void main(String args[]) throws InterruptedException
{
mythread t1=new mythread();
mythread1 t2=new mythread1();

t1.start();
t2.start();

}
}