class testprg
{
public static void main(String args[]) 
{
Thread t1=new Thread(
()->
{
for (int i=1;i<=10;i++)
{
System.out.println("value of i is "+i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
}
}
}

);

Thread t2=new Thread(
()->
{
for (int j=11;j<=20;j++)
{
System.out.println("value of j is "+j);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
}
}
}

);

Thread t3=new Thread(
()->
{
for (int k=21;k<=30;k++)
{
System.out.println("value of k is "+k);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
}
}
}

);


t1.start();
t2.start();
t3.start();

}
}