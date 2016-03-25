import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CheckBox implements ItemListener
{
	JLabel jlab;
	JCheckBox c1,c2,c3,c4;
	CheckBox()
	{
		JFrame jfrm=new JFrame("CheckBox Event");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(300,300);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c1=new JCheckBox("c");
		c2=new JCheckBox("c++");
		c3=new JCheckBox("Java");
		c4=new JCheckBox("Python");
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		jfrm.add(c1);
		jfrm.add(c2);
		jfrm.add(c3);
		jfrm.add(c4);
		jlab=new JLabel("Select any lang");
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		JCheckBox c=(JCheckBox)ie.getItem();
		if(c.isSelected())
		{
			jlab.setText(c.getText()+" is selected");
		}
		else
		{
			jlab.setText(c.getText()+" is not selected");
		}
		
	}
}
public class M 
{
	public static void main(String args[])
	{
		CheckBox cb=new CheckBox();
	}
}
