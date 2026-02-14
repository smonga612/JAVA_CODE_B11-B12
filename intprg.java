interface shape
{
public void area(float ...a);
public void print();
}


class circle implements shape
{
float area;
public void area(float ...r)
{
area=(float)3.14*r[0]*r[0];
}
public void print()
{
System.out.println("Area of circle is "+area);
}
}

class rect implements shape
{
float area;
public void area(float ...a)
{
area=a[0]*a[1];
}
public void print()
{
System.out.println("Area of rect is "+area);
}
}

class testprg
{
public static void main(String args[])
{
circle c1=new circle();
c1.area(3);
c1.print();

rect r1=new rect();
r1.area(3,5);
r1.print();


}





}

