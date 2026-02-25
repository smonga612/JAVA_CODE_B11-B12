import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements MouseListener,MouseMotionListener
{
myframe()
{
setVisible(true);
setSize(800,600);
addMouseListener(this);
addMouseMotionListener(this);

}
public void mouseExited(MouseEvent me)
{
setBackground(Color.BLUE);

System.out.println("Mouse Exit");
}

public void mouseEntered(MouseEvent me)
{
setBackground(Color.RED);
System.out.println("Mouse Enter");
}

public void mousePressed(MouseEvent me)
{
setBackground(Color.BLACK);

System.out.println("Mouse Pressed");
}

public void mouseReleased(MouseEvent me)
{
System.out.println("Mouse Released");
}

public void mouseClicked(MouseEvent me)
{
setBackground(Color.YELLOW);

System.out.println("Mouse Clicked");
}

public void mouseMoved(MouseEvent me)
{
//setBackground(Color.Y);
if (me.getX() < 500)
setBackground(Color.BLACK);
else
setBackground(Color.WHITE);



System.out.println("X:"+me.getX()+"Y: "+me.getY());
}

public void mouseDragged(MouseEvent me)
{
//setBackground(Color.Y);

System.out.println("Mouse Dragged");
}




}

class testprg
{
public static void main(String args[])
{
myframe mf1=new myframe();




}



}