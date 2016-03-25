import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ComboBox implements ActionListener
{
	JLabel l;
	JComboBox<String>jcb;
	String f[]={"India","USA","SA","AUS"};
	ComboBox()
	{
		JFrame jfrm=new JFrame("ComboBox Event");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(300,300);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jcb=new JComboBox<String>(f);
		jcb.addActionListener(this);
		jfrm.add(jcb);
		l=new JLabel("Select country");
		jfrm.add(l);
		jfrm.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=(String)jcb.getSelectedItem();
		l.setText("Your selection "+s);
	}
}
public class L 
{
	public static void main(String args[])
	{
		ComboBox cb=new ComboBox();
	}
}
