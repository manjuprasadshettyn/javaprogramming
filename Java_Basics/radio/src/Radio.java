import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
public class Radio implements ActionListener {
	JRadioButton r1,r2,r3;
	JLabel jl;
	Radio()
	{
		JFrame jf=new JFrame("radio button");
		jf.setLayout(new FlowLayout());
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		jl=new JLabel("select one ");
		r1.addActionListener(this);
		r2.addActionListener(this);
		jf.add(r1);
		jf.add(r2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		jf.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		JOptionPane.showMessageDialog(null,"selected radio button is "+ae.getActionCommand());
		
	}

	
}
class M
{
	public static  void main(String args[])
	{
		Radio r=new Radio();
	}
}