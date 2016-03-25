import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class ListDemo implements ListSelectionListener
{
	JList<String>jlist;
	JLabel l;
	JScrollPane jp;
	String city[]={"India","USA","SA","AUS"};
	ListDemo()
	{
		JFrame jfrm=new JFrame("List Event");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(300,300);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jlist=new JList<String>(city);
		jlist.addListSelectionListener(this);
		jp=new JScrollPane(jlist);
		jp.setPreferredSize(new Dimension(90,120));
		jfrm.add(jp);
		l=new JLabel("Select a city");
		jfrm.add(l);
		jfrm.setVisible(true);
	}
	public void valueChanged(ListSelectionEvent le)
	{
		int i=jlist.getSelectedIndex();
		if(i!=-1)
		{
			l.setText("Selected country is "+city[i]);
		}
		else
		{
			l.setText("No value");
		}
	}
}
public class S 
{
	public static void main(String args[])
	{
		ListDemo l=new ListDemo();
	}
}
