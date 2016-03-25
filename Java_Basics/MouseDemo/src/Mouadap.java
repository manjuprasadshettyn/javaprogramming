import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class  Mouadap extends MouseAdapter {
	Win w;
	public Mouadap(Win w)
	{
		this.w=w;
	}
	public void  mouseClicked(MouseEvent m)
	{
		w.x=m.getX();
		w.y=m.getY();
		w.msg="Mouse clicked at " + w.x+","+w.y;
		w.repaint();
	}
}