import java.applet.*;    
import java.awt.*;
public class ALCI extends Applet
{
String s=" ";
public void start()
{
s=s+"start....";
}
public void init()
{
s=s+"int...";
}
public void stop()
{
s=s+"stop....";
}
public void destroy()
{
s=s+"destroy...";
System.out.println(s);
}
public void paint(Graphics g)
{
s=s+"paint...";
g.drawString(s,100,100);
}
}
//<applet code=ALCI width=500 height=500></applet>
