import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.*;

public class MyFrame extends JFrame{
	private JMenuBar bar;
	private JMenu file;
	private JMenuItem clear,exit;
	private JPanel first ;
	JComboBox shapes ,stroke;
	JCheckBox fill;
	JButton color,undo;
	String[] SHAPES = {"Line","Rectangle","Oval"};
	String[] STROKE = {"1","2","3","4","5"};
    private Color clr;
	MyPanel m ;
	
	MyFrame ()
	{
		super("Final_Online_Assignment#2");
		//implement the bar 
		bar = new JMenuBar();
		setJMenuBar(bar);
		file = new JMenu("File");
		file.setMnemonic('F');
		clear = new JMenuItem ("New");
		clear.setMnemonic('N');
		file.add(clear);
		exit = new JMenuItem("Exit");
		exit.setMnemonic('x');
		file.add(exit);
		bar.add(file);
		
		first = new JPanel(new FlowLayout());
		m = new MyPanel();
		add(m,BorderLayout.CENTER);
		shapes = new JComboBox(SHAPES);
		shapes.setMaximumRowCount(3);
		first.add(shapes);
		stroke = new JComboBox (STROKE);
		stroke.setMaximumRowCount(5);
		first.add(stroke);
		fill= new JCheckBox("Filled");
		first.add(fill);
		color = new JButton("Color");
		color.setBackground(Color.white);
		first.add(color);
		undo = new JButton("Undo");
		first.add(undo);
		add(first,BorderLayout.NORTH);
		
		//start adding actions
		clear.addActionListener( new ActionListener() {
	        public void actionPerformed (ActionEvent e) 
	        {
	        	m.setnewPage();
	        	repaint();
	       	}});
		exit.addActionListener(new ActionListener() {
	        public void actionPerformed (ActionEvent e) 
	        {
	        	System.exit(0);
	       	}	});
		
		shapes.addItemListener(new ItemListener() {
	        public void itemStateChanged (ItemEvent e) 
	        {
	        	if (shapes.getSelectedItem().equals("Line"))
	        	{
	        		m.setLine();
	        		m.removeOval();
	        		m.removerect();
	        		repaint();
	        	}
	        	else if (shapes.getSelectedItem().equals("Oval"))
	        	{
	        		m.setOval();
	        		m.removerect();
	        		m.removeLine();
	        		repaint();
	        	}
	        	else if (shapes.getSelectedItem().equals("Rect"))
	        	{
	        		m.setrect();
	        		m.removeLine();
	        		m.removeOval();
	        		repaint();
	        	}
	        }});
	        	stroke.addItemListener(new ItemListener() {
	    	        public void itemStateChanged (ItemEvent e) 
	    	        {
	    	        	if (shapes.getSelectedItem().equals("1"))
	    	        	{
	    	        		m.setS1();
	    	        	}
	    	        	else if (shapes.getSelectedItem().equals("2"))
	    	        	{
	    	        		m.setS2();
	    	        	}
	    	        	else if (shapes.getSelectedItem().equals("3"))
	    	        	{
	    	        		m.setS3();
	    	        	}
	    	        	else if (shapes.getSelectedItem().equals("4"))
	    	        	{
	    	        		m.setS4();
	    	        	}
	    	        	else if (shapes.getSelectedItem().equals("5"))
	    	        	{
	    	        		m.setS5();
	    	        	}
	    	       	
	    	       	}	});
	        	fill.addItemListener( new ItemListener (){
	    	        public void itemStateChanged (ItemEvent e) 
	    	        {	
	    	        	if (fill.isSelected())
	    	        	{
	    	        		m.setFilled();
	    	        	}
	    	        	else 
	    	        		m.desel();
	    	        	}});
	        	color.addActionListener(new ActionListener ()
	        	{
	        		public void actionPerformed(ActionEvent e)
	        		{
	        			clr = JColorChooser.showDialog(MyFrame.this,"choos a color",clr);
	        			color.setBackground(clr);
	        			m.setColor(clr);
	        			repaint();
	        		}
	        	});
	        	

	    	        
	        	undo.addActionListener(new ActionListener() 
	        	{
	        			public void actionPerformed (ActionEvent s) 
	        	    {
	        		    
	            	}
	        	});
	        	
 
}
}
