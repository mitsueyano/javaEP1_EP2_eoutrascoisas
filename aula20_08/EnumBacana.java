package aula20_08;

import javax.swing.JOptionPane;

public class EnumBacana {

	public enum Meses{
		Jan, Fev, Mar;
	}
	
	public static void main(String[] args) {

		byte num, opcao;
		
		num = Byte.parseByte(JOptionPane.showInputDialog("Digite o número\n0 - Jan\n1 - Fev\n2 - Mar"));
	
		Meses mes = Meses.values()[num];
		switch (mes) {
		case Jan: JOptionPane.showMessageDialog(null, "Janeirinho");
			break;
		case Fev: JOptionPane.showMessageDialog(null, "Fevereirinho");
			break;
		case Mar:JOptionPane.showMessageDialog(null, "Marçinho");
			break;
		default: JOptionPane.showMessageDialog(null, "Outrinho");
		
		}

	}
}
