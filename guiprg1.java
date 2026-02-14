import java.awt.*;

class myframe extends Frame
{
myframe(String title,int x,int y)
{
setVisible(true);
setSize(x,y);
setTitle(title);
setLayout(null);
}
}



class testprg
{
public static void main(String args[])
{
myframe mf1=new myframe("first frame",500,500);

Label l1=new Label("Enter Number-1");
l1.setBounds(300,200,150,50);
mf1.add(l1);
TextField tf1=new TextField(20);
tf1.setBounds(500,200,150,20);
mf1.add(tf1);

Label l2=new Label("Enter Number-2");
l2.setBounds(300,300,150,50);
mf1.add(l2);
TextField tf2=new TextField(20);
tf2.setBounds(500,300,150,20);
mf1.add(tf2);



Button b1=new Button("Add the value");
b1.setBounds(300,400,150,50);

mf1.add(b1);


}
}