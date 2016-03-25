import java.awt.Color;
import java.util.Random;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class  Keyadap extends KeyAdapter {
	Win w;
	
	public Keyadap(Win w) {
		this.w=w;
	}

	public void  keyPressed(KeyEvent m)
	{
		
		Random r=new Random();
		int red=0+r.nextInt(255-0+1);
		int g=0+r.nextInt(255-0+1);
		int b=0+r.nextInt(255-0+1);
		w.c=new Color(red,g,b);
		w.repaint();
		
	}
}
