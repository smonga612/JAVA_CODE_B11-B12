import java.io.*;

class student implements Serializable
{
int roll_no;
String name;
int i;
transient float time;
student(int r,String nam,float t)
{
roll_no=r;
name=nam;
time=t;
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

//deserialization
System.out.println("Record of s2 from deserialization of s1 object");
student s2=new student();
FileInputStream fis=new FileInputStream("student.obj");
ObjectInputStream ois=new ObjectInputStream(fis);

s2=(student)ois.readObject();
s2.printRecord();



}




}
