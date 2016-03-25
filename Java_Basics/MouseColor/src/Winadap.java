import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Winadap extends WindowAdapter {
	public void windowClosing(WindowEvent w)
	{
		System.exit(0);
	}
}