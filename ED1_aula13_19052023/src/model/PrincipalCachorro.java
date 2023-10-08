package model;

import javax.swing.JOptionPane;

public class PrincipalCachorro {
	public static void main(String arg[]) {
		Cachorro cao1 = new Cachorro();
		Dono d1 = new Dono(cao1);
		
		
		JOptionPane.showMessageDialog(null, d1);
		
		
	}
}
