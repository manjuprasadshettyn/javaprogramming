import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


public class Win extends Frame{
	int x,y;
	Color c=new Color(255,100,100);
	public Win()
	{
		addMouseListener(new Mouadap(this));
		addWindowListener(new Winadap());
		addKeyListener(new Keyadap(this));
	}
	public void paint(Graphics g)
	{
		//g.setColor(Color.blue);
		//g.drawRect(100, 50, 50, 40);
		//g.setXORMode(Color.black);
	
		g.setColor(c);
		
		g.fillRect(0,0,800, 700);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Win w=new Win();
		w.setSize(800, 700);
		w.setVisible(true);


	}

}
