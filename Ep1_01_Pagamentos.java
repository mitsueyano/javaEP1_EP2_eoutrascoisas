package AtividadesLP;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ep1_01_Pagamentos {

	public static void main(String[] args) {
		float vTotal = 0, vFinal = 0;
		byte formaPag, quantP = 0;
		String msg = "";
		
		DecimalFormat df = new DecimalFormat("0.00");
		
	
		do {
			vTotal = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor total da compra?"));
			if (vTotal <= 0) {
				JOptionPane.showMessageDialog(null, "Valor inválido.");
			}
		} while(vTotal <= 0);
		
		formaPag = Byte.parseByte(JOptionPane.showInputDialog("Qual a forma de pagamento?\n1 - Pagamento à vista(Débito/Dinheiro - Desconto de 5%)\n2 - Pagamento via PIX - Desconto de 8%\n3 - Pagamento em até 3x - Sem juros\n4 - Pagamentos com 4 ou mais parcelas(Máximo 10x) - Juros 2% ao mês"));

		switch (formaPag) {
			case 1:
				vFinal =  (vTotal * 0.95f);
				msg = "Aplicado desconto de 5%";
				break;
			case 2:
				vFinal = (vTotal * 0.92f);
				msg = "Aplicado desconto de 8%";
				break;
			case 3:
				vFinal = vTotal;
				msg = "Aplicado parcelamento sem juros.";
				break;
			case 4:
				do {
					quantP = Byte.parseByte(JOptionPane.showInputDialog("Qual a quantidade de parcelas (max de 10)"));
					if (quantP>= 11) {
						JOptionPane.showMessageDialog(null, "O número de parcelas deve ser até 10x");
					}
					else if (quantP < 1) {
						JOptionPane.showMessageDialog(null, "Número de parcelas inválido.");
					}
					else if (quantP >= 0 && quantP <= 3) {
						vFinal = vTotal;
						msg = "Aplicado parcelamento sem juros.";
					}
					else {
						vFinal =  (float)(vTotal * Math.pow(1 + 0.02, quantP));
						msg = "Aplicado parcelamento com juros de 2%";
					}
				} while (quantP <=0 || quantP >=11);				
				break;
			default:
				JOptionPane.showMessageDialog(null, "Forma de pagamento inválida. Tente novamente.");
				System.exit(0);
				break;
		}
		JOptionPane.showMessageDialog(null, "Valor Total: R$" + df.format(vTotal) + "\nValor Final: R$" + df.format(vFinal) + "\n" + msg);
		
	}

}
