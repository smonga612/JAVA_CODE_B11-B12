import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements ActionListener
{
Label l1;
Label l2;
Label l3;
TextField tf1;
TextField tf2;
Button b1,b2;
myframe()
{
setVisible(true);
setSize(800,600);
setLayout(null);
}

void designForm()
{
l1=new Label("Enter the number-1");
l2=new Label("Enter the number-2");
l3=new Label("Result is ");
tf1=new TextField(10);
tf2=new TextField(10);
b1=new Button("Add");
b2=new Button("Subtract");

l1.setBounds(100,100,100,50);
tf1.setBounds(250,100,100,50);
l2.setBounds(100,200,100,50);
tf2.setBounds(250,200,100,50);
b1.setBounds(100,250,100,50);
b2.setBounds(250,250,100,50);

l3.setBounds(100,350,100,50);
add(l1);
add(tf1);
add(l2);
add(tf2);
add(b1);
add(b2);
add(l3);
b1.addActionListener(this);
b2.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
int a,b,c;
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
//System.out.println(ae.getSource());
//System.out.println(ae.getActionCommand());

if(ae.getActionCommand()=="Add")
c=a+b;
else
c=a-b;
l3.setText("Result is "+c);


//System.out.println("Result is "+c);


}



}

class testprg
{
public static void main(String args[])
{
myframe mf1=new myframe();
mf1.designForm();


}


}