import java.awt.*;
import java.awt.Graphics.*;

class myframe extends Frame
{

myframe()
{
setVisible(true);
setSize(1000,700);
}
public void paint(Graphics g)
{
Font f=new Font("Arial",Font.BOLD,30);
//g.setColor(Color.RED);
g.setFont(f);
//g.drawLine(10,100,800,100);
//g.drawLine(100,100,100,800);
//g.drawRect(250,250,200,100);
//g.drawRect(275,300,200,200);
//g.fillRect(250,250,200,100);
//g.setColor(Color.WHITE);
//g.fillRect(275,275,50,50);
g.setColor(Color.BLUE);

//g.drawOval(400,400,100,100);
//g.fillOval(400,400,100,100);
//g.drawArc(375,375,100,100,0,180);
//g.fillArc(375,375,100,100,0,180);

//g.setColor(Color.ORANGE);

//g.drawArc(375,375,100,100,180,180);
//g.fillArc(375,375,100,100,180,180);
//g.setColor(Color.GREEN);
int i=100;
int flag=0;
while(true)
{
g.setColor(Color.BLUE);
g.drawString("Welcome to Class ",i,100);
try
{
Thread.sleep(100);
g.setColor(Color.WHITE);
g.drawString("Welcome to Class ",i,100);
if (i<900 && flag==0)
i=i+10;
if(i==900)
flag=1;
if(flag==1)
i=i-10;
if(i==100)
flag=0;
}
catch(Exception e)
{
}
}

}

}

class testprg
{
public static void main(String args[])
{
myframe mf1=new myframe();


}


}