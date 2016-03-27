import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceTest extends JFrame implements ActionListener,ListSelectionListener{

	public String str="";
	JPanel top=new JPanel();
	JPanel middle=new JPanel();
	JPanel bottom=new JPanel();
	
	JList<String>jlist;
	String city[]={"Udupi","Mangalore","Bangalore","Mumbai","Delhi","Jaipur","Bhopal","Mysore","Sikkim","Belgam"};
	JScrollPane jp;
	JTextField jfname=new JTextField(25);
	JTextField jfnum=new JTextField(10);
    JRadioButton jrbMale = new JRadioButton("Male");
    JRadioButton jrbFemale = new JRadioButton("Female");
    JButton jbSubmit = new JButton("Submit");

public ChoiceTest(){
    setLayout(new FlowLayout(10));
    add(new Label("Select a city:"));
    jlist=new JList<String>(city);
	jlist.addListSelectionListener(this);
	jp=new JScrollPane(jlist);
	jp.setPreferredSize(new Dimension(90,120));
	top.add(jp);
	
	middle.add(new Label("Enter name:"));
	middle.add(jfname);
	
	middle.add(new Label("Enter number:"));
	middle.add(jfnum);
	
    ButtonGroup group = new ButtonGroup();
    group.add(jrbMale);
    group.add(jrbFemale);

    bottom.add(new Label("Select gender:"));
    bottom.add(jrbMale);
    bottom.add(jrbFemale);
    
    Container c = getContentPane();
    c.add(top,BorderLayout.NORTH);
    c.add( middle,BorderLayout.CENTER);
    c.add(bottom,BorderLayout.SOUTH);
    
    
    add(jbSubmit);
    jbSubmit.addActionListener(this);

    setTitle("Details Selection");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(620,500);
    setVisible(true);
}

public static void main(String args[]) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
        	
           ChoiceTest app = new ChoiceTest();
            app.setVisible(true);
        }
    });
}

public void valueChanged(ListSelectionEvent arg0) {
	// TODO Auto-generated method stub
	int idx =jlist.getSelectedIndex();
	
	str="Selected city : "+city[idx]+"\r\n";
}

public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	str+="Entered name : "+jfname.getText()+"\r\n";
	str+="Entered Number : "+jfnum.getText()+"\r\n";
	if(jrbMale.isSelected())
	str+="Selected gender : "+jrbMale.getText()+"\r\n";
	else if(jrbFemale.isSelected())
		str+="Selected gender : "+jrbFemale.getText()+"\r\n";
	
	JOptionPane.showMessageDialog(this,str,"Selected Contents Are", JOptionPane.INFORMATION_MESSAGE);
	
}


}

