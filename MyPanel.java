import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Vector;
//clra shapev.clear();
public class MyPanel extends JPanel{
	boolean rect,line,oval
	,s2,s3,s4,s5
	,filled
	,newPage=false; 
	boolean s1=true;
	Point p1,p2;
    Color Color;
    
    Vector shapeV ;
    
	MyPanel ()
	{
		p1=p2=new Point(0,0);
		shapeV = new Vector();
		setBackground(Color.WHITE);
		
		addMouseListener(
				new MouseAdapter()
				{
					public void mousePressed(MouseEvent e) 
					{
						p1=e.getPoint();
			     	}
				});
		
		addMouseMotionListener(
				new MouseMotionAdapter() 
				{
					public void mouseDragged(MouseEvent e) 
					{
						p2=e.getPoint();
						repaint();
					}
				});
	
				}
	public void paintComponent(Graphics g)
	{
	   super.paintComponent(g);

	    if (newPage) 
	    {
	    	setBackground(Color.WHITE);
     	}
	    
	    if (rect&&filled==false) 
	    {
	    	if (s1) {
	    	Graphics2D k =(Graphics2D)g;
	    	k.setPaint(Color);
		    k.setStroke(new BasicStroke(1f));
		    k.draw(new Rectangle2D.Double(p1.getX(),p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
		    shapeV.add(k);
	    	}
	    	else if (s2)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(2f));
			    k.draw(new Rectangle2D.Double(p1.getX(), p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}
	    	else if (s3)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(3f));
			    k.draw(new Rectangle2D.Double(p1.getX(), p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}
	    	else if (s4)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(4f));
			    k.draw(new Rectangle2D.Double(p1.getX(), p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}else
	    	{
	    		Graphics2D k =(Graphics2D)g;
			    k.setPaint(Color);
			    k.setStroke(new BasicStroke(5f));
			    k.draw(new Rectangle2D.Double(p1.getX(), p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}
	    }
	    else if (oval&& filled == false) 
	    {
	    	if (s1) {
	    	Graphics2D k =(Graphics2D)g;
		    k.setPaint(Color);
		    k.setStroke(new BasicStroke(1f));
		    k.draw(new Ellipse2D.Double(p1.getX(),p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
		    shapeV.add(k);

	    	}
	    	else if (s2)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(2f));
			    k.draw(new Ellipse2D.Double(p1.getX(),p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}
	    	else if (s3)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(3f));
			    k.draw(new Ellipse2D.Double(p1.getX(), p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}
	    	else if (s4)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(4f));
			    k.draw(new Ellipse2D.Double(p1.getX(),p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}else
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(5f));
			    k.draw(new Ellipse2D.Double(p1.getX(), p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}
	    }
	    else if (line&& filled == false) 
	    {
	    	if (s1) {
	    	Graphics2D k =(Graphics2D)g;
		    k.setPaint(Color);
		    k.setStroke(new BasicStroke(1f));
		    k.draw(new Line2D.Double(p1.getX(), p1.getY(),p2.getX(),p2.getY() ));
		    shapeV.add(k);

	    	}
	    	else if (s2)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(2f));
			    k.draw(new Line2D.Double(p1.getX(), p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}
	    	else if (s3)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(3f));
			    k.draw(new Line2D.Double(p1.getX(), p1.getY(),p2.getX(),p2.getY() ));
			    shapeV.add(k);

	    	}
	    	else if (s4)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(4f));
			    k.draw(new Line2D.Double(p1.getX(), p1.getY(),p2.getX(),p2.getY() ));
			    shapeV.add(k);

	    	}else
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(5f));
			    k.draw(new Line2D.Double(p1.getX(), p1.getY(),p2.getX(),p2.getY() ));
			    shapeV.add(k);

	    	}
	    }
	    
	    
	    //draw
	    else if (rect&&filled) 
	    {
	    	if (s1) {
	    	Graphics2D k =(Graphics2D)g;
	    	k.setPaint(Color);
		    k.setStroke(new BasicStroke(1f));
		    k.fill(new Rectangle2D.Double(p1.getX(),p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
		    shapeV.add(k);

	    	}
	    	else if (s2)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(2f));
			    k.fill(new Rectangle2D.Double(p1.getX(), p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}
	    	else if (s3)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(3f));
			    k.fill(new Rectangle2D.Double(p1.getX(), p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}
	    	else if (s4)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(4f));
			    k.fill(new Rectangle2D.Double(p1.getX(), p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}else
	    	{
	    		Graphics2D k =(Graphics2D)g;
			    k.setPaint(Color);
			    k.setStroke(new BasicStroke(5f));
			    k.fill(new Rectangle2D.Double(p1.getX(), p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}
	    }
	    else if (oval&& filled) 
	    {
	    	if (s1) {
	    	Graphics2D k =(Graphics2D)g;
		    k.setPaint(Color);
		    k.setStroke(new BasicStroke(1f));
		    k.fill(new Ellipse2D.Double(p1.getX(),p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
		    shapeV.add(k);

	    	}
	    	else if (s2)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(2f));
			    k.fill(new Ellipse2D.Double(p1.getX(),p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}
	    	else if (s3)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(3f));
			    k.fill(new Ellipse2D.Double(p1.getX(), p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}
	    	else if (s4)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(4f));
			    k.fill(new Ellipse2D.Double(p1.getX(),p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}else
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(5f));
			    k.fill(new Ellipse2D.Double(p1.getX(), p1.getY(),(int) Math.abs(p2.getX()-p1.getX()),(int) Math.abs(p2.getY()-p1.getY())));
			    shapeV.add(k);

	    	}
	    }
	    else if (line&& filled) 
	    {
	    	if (s1) {
	    	Graphics2D k =(Graphics2D)g;
		    k.setPaint(Color);
		    k.setStroke(new BasicStroke(1f));
		    k.fill(new Line2D.Double(p1.getX(), p1.getY(),p2.getX(),p2.getY() ));
		    shapeV.add(k);

	    	}
	    	else if (s2)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(2f));
			    k.fill(new Line2D.Double(p1.getX(), p1.getY(),p2.getX(),p2.getY() ));
			    shapeV.add(k);

	    	}
	    	else if (s3)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(3f));
			    k.fill(new Line2D.Double(p1.getX(), p1.getY(),p2.getX(),p2.getY() ));
			    shapeV.add(k);

	    	}
	    	else if (s4)
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(4f));
			    k.fill(new Line2D.Double(p1.getX(), p1.getY(),p2.getX(),p2.getY() ));
			    shapeV.add(k);

	    	}else
	    	{
	    		Graphics2D k =(Graphics2D)g;
	    		k.setPaint(Color);
			    k.setStroke(new BasicStroke(5f));
			    k.fill(new Line2D.Double(p1.getX(), p1.getY(),p2.getX(),p2.getY() ));
			    shapeV.add(k);

	    	}
	    }
	    
	
    }
    void setColor (Color r) {Color=r;}
	void setnewPage() {newPage=true;}//done
	void setrect() {rect=true;}
	void removerect() {rect=false;}
	void removeLine() {line=false;}
	void removeOval() {oval = false; }

	void setLine() {line=true;}
	void setOval() {oval=true;}
	void setS1() {
		s1=true;
		s2=false;
		s3=false;
		s4=false;
		s5=false;
		}
	void setS2() {
		s2=true;
		s1=false;
		s3=false;
		s4=false;
		s5=false;
		}
	void setS3() {s3=true;s2=false;
	s1=false;
	s4=false;
	s5=false;}
	void setS4() {s4=true;s2=false;
	s3=false;
	s1=false;
	s5=false;}
	void setS5() {
		s5=true;
		s2=false;
	s3=false;
	s4=false;
	s1=false;}
	void setFilled() {filled=true;}
	void desel() {filled=false;}
	
	
}
