import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ListenerCase implements MouseListener
{
	private Case case1;
	private Plateau plateau;
	
	public ListenerCase(Case pCase1, Plateau pPlateau) 
	{
		super();
		this.case1 = pCase1;
		this.plateau = pPlateau;
	}

	public void mouseClicked(MouseEvent arg0) 
	{
	
	}


	public void mouseEntered(MouseEvent arg0) 
	{
		
	}


	public void mouseExited(MouseEvent arg0) 
	{
		
	}


	public void mousePressed(MouseEvent arg0) 
	{
		if(case1.isSelectionnee())
		{
			plateau.deplacer(case1);
		}
	}


	public void mouseReleased(MouseEvent arg0) 
	{
		
	}
}
