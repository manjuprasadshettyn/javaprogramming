import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
           //DeclaringObjects
                Frame f=new Frame();
                
                Label l1=new Label("First Number");
                Label l2=new Label("Second Number");
                Label l3=new Label("Third Number");
                Label l4=new Label("Result");
                TextField t1=new TextField();
                TextField t2=new TextField();
                TextField t3=new TextField();
                TextField t4=new TextField();
                Button b1=new Button("Sum");
                Button b2=new Button("Avg");
                Button b3=new Button("Max");
                Button b4=new Button("Cancel");
                
                Calculator()
                {
                               //Giving Coordinates
                                l1.setBounds(50,100,105,20);
                                l2.setBounds(50,140,105,20);
                                l3.setBounds(50,180,105,20);
                                l4.setBounds(50,220,105,20);
                                
                                t1.setBounds(200,100,100,20);
                                t2.setBounds(200,140,100,20);
                                t3.setBounds(200,180,100,20);
                                t4.setBounds(200,220,100,20);
                                
                                b1.setBounds(50,270,50,20);
                                b2.setBounds(110,270,50,20);
                                b3.setBounds(170,270,50,20);
                                b4.setBounds(230,270,50,20);
                             
                                
                                //Adding components to the frame
                                f.add(l1);
                                f.add(l2);
                                f.add(l3);
                                f.add(l4);
                               
                                f.add(t1);
                                f.add(t2);
                                f.add(t3);
                                f.add(t4);
                                
                                f.add(b1);
                                f.add(b2);
                                f.add(b3);
                                f.add(b4);
                                
                                b1.addActionListener(this);
                                b2.addActionListener(this);
                                b3.addActionListener(this);
                                b4.addActionListener(this);
                        
                                f.setLayout(null);
                                f.setVisible(true);
                                f.setSize(400,350);
                               
                }
                public void actionPerformed(ActionEvent e)
                {
                                float n1=Float.parseFloat(t1.getText());
                                float n2=Float.parseFloat(t2.getText());
                                float n3=Float.parseFloat(t3.getText());
                                
                                if(e.getSource()==b1)
                                {
                                                t4.setText(String.valueOf(n1+n2+n3));
                                }
                                if(e.getSource()==b2)
                                {
                                                t4.setText(String.valueOf((n1+n2+n3)/3));
                                }
               
                                if(e.getSource()==b3)
                                {
                                                t4.setText(String.valueOf(Math.max(Math.max(n1, n2),n3)));
                                }
               
                                if(e.getSource()==b4)
                                {
                                                System.exit(1);
                                }
               
                }
                               
                public static void main(String args[])
                {
                                new Calculator();
                }

}