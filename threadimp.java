class mythread implements Runnable
{
public void run()
{
Thread t=Thread.currentThread();

for(int i=1;i<=10;i++)
{
System.out.println("Value of i for thread "+t.getName()+" is "+i);
}
}


}
class testprg
{
public static void main(String args[])
{
mythread mt1=new mythread();
Thread t1=new Thread(mt1);
Thread t2=new Thread(mt1);
t1.setName("First");
t2.setName("Second");
t1.start();
t2.start();

}



}