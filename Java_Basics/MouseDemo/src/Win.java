import java.awt.*;

public class Win extends Frame{
	String msg="Welcome : This is Window demo";
	int x=60,y=50;
	public Win()
	{
		addMouseListener(new Mouadap(this));
		addWindowListener(new Winadap());
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Win w=new Win();
		w.setSize(300, 200);
		
		//w.setSize(new Dimension(300,200));
		w.setTitle("An Window Creation Demo");
		w.setVisible(true);

	}

}
