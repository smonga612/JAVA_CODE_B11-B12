interface vechile
{
public void move();


}


class car implements vechile
{
public void move()
{
System.out.println("move by car");
}
}

class bus implements vechile
{
public void move()
{
System.out.println("move by bus");
}
}

class train implements vechile
{
public void move()
{
System.out.println("move by train");
}
}




class journey
{
void startjourney(vechile v)
{
System.out.println("Journey Started");
v.move();
}
}

class testprg
{
public static void main(String args[])
{
car c1=new car();
bus b1=new bus();
train t1=new train();

journey p1=new journey();
p1.startjourney(c1);
journey p2=new journey();
p2.startjourney(b1);

journey p3=new journey();
p3.startjourney(t1);

}





}