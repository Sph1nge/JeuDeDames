import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Paint;

import javax.swing.JPanel;


public class Case extends JPanel 
{

	private Couleur couleur;
	private boolean selectionnee;

	public Case(Couleur pCouleur)
	{
		setLayout(new GridLayout(1,0));
		this.couleur=pCouleur;
		initCouleur();
	}	
	
	private void initCouleur()
	{
		switch(couleur)
		{
			case BLANC :
				setBackground(Color.WHITE);
				setForeground(new Color(200, 200, 200));
				
				break;
			case NOIR :
				setBackground(Color.BLACK);
				setForeground(new Color(20, 20, 20));
				break;
		}
	}
	
	public Couleur getCouleur() 
	{
		return this.couleur;
	}

	public boolean isSelectionnee() 
	{
		return this.selectionnee;
	}

	public void setSelectionnee(boolean pSelectionnee) 
	{
		this.selectionnee = pSelectionnee;
		if(pSelectionnee)
		{
			setBackground(Color.BLUE);
			setForeground(Color.LIGHT_GRAY);
		}
		else 
		{
			initCouleur();
		}
	}

	public void paintComponent(Graphics pGraphic)
	{
		Paint paint;
		Graphics2D g2d;
		if (pGraphic instanceof Graphics2D) 
		{
			g2d = (Graphics2D) pGraphic;
		}
		else 
		{
			System.out.println("Error");
			return;
		}
		paint = new GradientPaint(0,0, getBackground(), getWidth(), getHeight(), getForeground());
		g2d.setPaint(paint);
		pGraphic.fillRect(0, 0, getWidth(), getHeight());
	}
}
