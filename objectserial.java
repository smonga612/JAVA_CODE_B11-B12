import java.io.*;

class student implements Serializable
{
int roll_no;
String name;
transient float time;
student(int r,String nam,float t)
{
roll_no=r;
name=nam;
time =t;
}
student()
{

}
void printRecord()
{
System.out.println("Roll No : "+roll_no);
System.out.println("Name : "+name);
System.out.println("Current Time "+time);

}
}

class testprg
{
public static void main(String args[]) throws Exception
{
//serialization
student s1=new student(1001,"Rohit",10.35f);
s1.printRecord();
FileOutputStream fos=new FileOutputStream("student.obj");
ObjectOutputStream oos=new ObjectOutputStream(fos);
System.out.println("Object serialization done successfully");

oos.writeObject(s1);
oos.close();




}




}
