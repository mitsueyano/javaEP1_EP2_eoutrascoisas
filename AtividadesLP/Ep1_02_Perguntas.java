package AtividadesLP;

import javax.swing.JOptionPane;

public class Ep1_02_Perguntas {

	public static void main(String[] args) {
		int resp;
		int sim = 0;
		
		resp = JOptionPane.showConfirmDialog(null, "Telefonou para a vítima?");
		if (resp == 0) {
			sim++;
		}else if (resp == 2){
			System.exit(0);
		}
		
		resp = JOptionPane.showConfirmDialog(null, "Esteve no local do crime?");
		if (resp == 0) {
			sim++;
		}else if (resp == 2){
			System.exit(0);
		}
	
		resp = JOptionPane.showConfirmDialog(null, "Mora perto da vítima?");
		if (resp == 0) {
			sim++;
		}else if (resp == 2){
			System.exit(0);
		}
		
		resp = JOptionPane.showConfirmDialog(null, "Devia para a vítima?");
		if (resp == 0) {
			sim++;
		}else if (resp == 2){
			System.exit(0);
		}
		
		resp = JOptionPane.showConfirmDialog(null, "Já trabalhou com a vítima?");
		if (resp == 0) {
			sim++;
		}else if (resp == 2){
			System.exit(0);
		}
		
		if (sim == 2) {
			JOptionPane.showMessageDialog(null, "SUSPEITA");
		} else if (sim >= 3 && sim <=4) {
			JOptionPane.showMessageDialog(null, "CÚMPLICE");
		} else if (sim == 5){
			JOptionPane.showMessageDialog(null, "ASSASSINO");
		} else {
			JOptionPane.showMessageDialog(null, "INOCENTE");
		}

	}

}
