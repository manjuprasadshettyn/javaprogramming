import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TableDemo
{
	TableDemo()
	{
		JFrame jfrm=new JFrame("List Event");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(700,700);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String col[]={"Name","Empid","Address"};
		Object data[][]={
				{"ram","201","Nitte"},
				{"som","202","Bangalore"},
				{"anu","203","udupi"},
				{"vani","204","Kinnigoli"},
				{"kavitha","205","Mangalore"},
				{"kavya","206","Mangalore"}
				
		};
		JTable t=new JTable(data,col);
		JScrollPane jsp=new JScrollPane(t);
		jfrm.add(jsp);
		jfrm.setVisible(true);
	}
}
public class m 
{
	public static void main(String args[])
	{
		TableDemo l=new TableDemo();
	}
}
