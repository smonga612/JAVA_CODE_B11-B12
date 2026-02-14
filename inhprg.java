class Employee
{
int id;
String name;
void setId(int id)
{
this.id=id;
}
int getId()
{
return(id);
}

void setName(String  name)
{
this.name=name;
}
String getName()
{
return(name);
}
}
class Manager extends Employee
{
int postId;
void setpostId(int postId)
{
this.postId=postId;
}
int getpostId()
{
return(postId);
}


}



class testprg
{
public static void main(String args[])
{
Manager m1=new Manager();
m1.setId(1001);
m1.setName("Vikas");
m1.setpostId(2345);
System.out.println("Id "+m1.getId()+" "+"Name "+m1.getName()+" "+"Post Id"+m1.getpostId());

}

}