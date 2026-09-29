import java.awt.*;
import java.awt.event.*;
public class FrameWindowClose extends Frame 
{
  FrameWindowClose(String title)
  {
   
//Register the Listeners
addWindowListener(new MyWindowAdapter(this)); 
 //set window title using setTitle method
  setTitle(title);  
  setSize(300,300);      
  setVisible(true);
  }
  public static void main(String args[])
  {
   FrameWindowClose window = new FrameWindowClose("Frme Close Demo");
  }
} // FrameWindowClose class ends
class MyWindowAdapter extends WindowAdapter
{
FrameWindowClose fwc;
MyWindowAdapter(FrameWindowClose fwc)
{
this.fwc = fwc;
}
public void windowClosing(WindowEvent e)
 {
  //hide the window when window's close button is clicked
  fwc.setVisible(false);   
  System.out.println("Frame will be closed soon....."); 
  fwc.dispose();
  //System.exit(0); 
  }
} // MyWindowAdapter class ends

