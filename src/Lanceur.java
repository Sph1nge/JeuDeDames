import javax.swing.*;


public class Lanceur 
{
	public static void main(String[] args) 
	{
		try
		{

		}
		catch(Exception e)
		{
			
		}

		JOptionPane jop1;

		jop1 = new JOptionPane();
		jop1.showMessageDialog(null, "Bonne partie !", "Information", JOptionPane.INFORMATION_MESSAGE);


		JFrame f = new JFrame();
		f.setSize(600, 600);
		f.setTitle("Jeu de dames");
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new Plateau(9)); //default 9
		f.setVisible(true);
	}

}
