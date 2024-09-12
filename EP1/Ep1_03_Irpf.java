package AtividadesLP;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ep1_03_Irpf {

	public static void main(String[] args) {
		float sal = 0, salFinal = 0, aliq = 0, ret = 0;
		String msg = "";
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Digite o salário: ");
			sal = scanner.nextFloat();
			if (sal <= 0) {
				System.out.println("Salário inválido.");
			}
		}while (sal <= 0);
		scanner.close();
		
		if (sal <= 2259.20) { //até 2.259,20
			salFinal = sal;
			ret = 0;
			msg = "Alíquota - 0% | IR - R$0,00";
		} else if (sal > 2259.20 && sal < 2826.66) { //de 2.259,21 até 2.826,65
			aliq = sal * 0.075f;
			ret = (aliq - 169.44f);
			salFinal = sal - ret;
			msg = "Alíquota - 7,50% | IR - R$169,44";
		} else if (sal > 2826.65 && sal < 3751.06) { //de 2.826,66 até 3.751,05
			aliq = sal * 0.15f;
			ret = (aliq - 381.44f);
			salFinal = sal - ret;
			msg = "Alíquota - 15% | IR - R$381,44";
		} else if (sal > 3751.05 && sal < 4664.69) { //de 3.751,06 até 4.664,68
			aliq = sal * 0.225f;
			ret =  (aliq - 662.77f);
			salFinal = sal - ret;
			msg = "Alíquota - 22,5% | IR - R$662,77";
		} else if (sal > 4664.68) { //acima de 4.664,68
			aliq = sal * 0.275f;
			ret = (aliq - 896f);
			salFinal = sal - ret;
			msg = "Alíquota - 27,5% | IR - R$896,00";
		}
		
		System.out.print("\nSalário total: R$" + df.format(sal) + "\n**Retenção: R$" + df.format(ret) + "\nSalário final: R$" + df.format(salFinal) + "\n\n" + msg);
		
		
		
		

	}

}
