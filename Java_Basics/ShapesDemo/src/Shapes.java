import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ShapesDemo extends JPanel implements ActionListener
{
    JRadioButton circle,line,rectangle,red,blue,green;
    ButtonGroup objects,color;
    int a;

    ShapesDemo()
    {
        setLayout(new FlowLayout(10));
        add(new Label("Select a Shape:"));
        circle=new JRadioButton("Circle");
        circle.addActionListener(this);
        add(circle);

        line=new JRadioButton("Line");
        line.addActionListener(this);
        add(line);

        rectangle=new JRadioButton("Rectangle");
        rectangle.addActionListener(this);
        add(rectangle);

        objects=new ButtonGroup();

        objects.add(circle);
        objects.add(line);
        objects.add(rectangle);
        
        add(new Label("Select Backgroud color:"));
        
        red=new JRadioButton("Red");
        red.addActionListener(this);
        add(red);
        
        green=new JRadioButton("Green");
        green.addActionListener(this);
        add(green);
        
        blue=new JRadioButton("Blue");
        blue.addActionListener(this);
        add(blue);
        
        color=new ButtonGroup();
        color.add(red);
        color.add(green);
        color.add(blue);
        
    }

    public  void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();


        if(str=="Circle")
        	a=1;

        if(str=="Line")
        	a=2;

        if(str=="Rectangle")
        	a=3;
        
        if(str=="Red")
        	setBackground(Color.RED);
        
        if(str=="Green")
        	setBackground(Color.GREEN);
        
        if(str=="Blue")
        	setBackground(Color.BLUE);
        
        repaint();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(a==1)
        {
            g.drawOval(200,100,50,100);
        	
        }
        if(a==2)
        {
        	g.drawLine(200, 200, 300, 300);
        }
        if(a==3)
        {
        	g.drawRect(300,200,50,50);
        }
      
    }
}
class myframe extends JFrame
{
    Container c;
    myframe()
    {
        c=getContentPane();
        ShapesDemo p=new ShapesDemo();
        c.add(p);
    }
}

class Shapes
{
    public static void main(String args[])
    {
        myframe f=new myframe();
        f.setTitle("Objects and Color");
        f.setSize(500,500);
        f.setVisible(true);
    }
}





