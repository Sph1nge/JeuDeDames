import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;

import javax.swing.JPanel;


public class Pion extends JPanel 
{
	private Couleur couleur;
	private boolean monte;

	public Pion(Couleur pCouleur, boolean pMonte) 
	{
		this.monte=pMonte;
		this.couleur = pCouleur;
		setOpaque(false);
		switch (pCouleur) 
		{
			case BLANC :
				setForeground(Color.WHITE);
				setBackground(new Color(220, 220, 220));
				break;
			case NOIR :
				setForeground(new Color(70, 70, 70));
				setBackground(new Color(200, 200, 200));
				break;
		}
	}

	public Couleur getCouleur() 
	{
		return couleur;
	}

	public boolean isMonte() 
	{
		return monte;
	}

	public void setMonte(boolean pMonte) 
	{
		this.monte = pMonte;
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
		pGraphic.fillOval(5, 5, getWidth()-10, getHeight()-10);
	}
}
