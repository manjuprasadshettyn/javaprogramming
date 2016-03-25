import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;


class  Mouadap extends MouseAdapter {
	Win w;
	public Mouadap(Win w)
	{
		this.w=w;
	}
	public void  mouseClicked(MouseEvent m)
	{
		
		Random r=new Random();
		int red=0+r.nextInt(255-0+1);
		int g=0+r.nextInt(255-0+1);
		int b=0+r.nextInt(255-0+1);
		w.c=new Color(red,g,b);
		//w.x=m.getX();
		//w.y=m.getY();
		//w.msg="Mouse clicked at " + w.x+","+w.y;
		w.repaint();
		
	}
}