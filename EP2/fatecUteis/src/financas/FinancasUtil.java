package financas;

public class FinancasUtil {

	public static void main(String[] args) {

		double M = vlrFinalJurosComposto(1, 1, 1);
		System.out.println("Juros");
		System.out.println(M);
		System.out.println("---");
		
		String cpf = "52998224725";
		System.out.println("CPF");
		boolean validar = cpfValido(cpf);
		System.out.println(validar);
		System.out.println("---");


	}
	
	public static double vlrFinalJurosComposto(double capitalIni, double taxa, double periodo) {
		
		double M = capitalIni * Math.pow((1 + taxa), periodo) ;
		return M;
		
	}
	
	public static boolean cpfValido(String string) {
		
		double soma = 0;
		int i, j;

		boolean valido = false;
		
		//****Verificação da quantidade de caracteres****
		if (string.length() != 11) {
			valido = false;
		}else {	
			
			//****Verificação do primeiro dígito****
			for(i = 0, j = 10; i <= 8; i++, j--) { //Percorre por cada caractere
				
				//Transforma index CHAR em INT
				char index = string.charAt(i);
				int num  = Integer.parseInt(String.valueOf(index));
				
				//Multiplica-se os 9 primeiros dígitos pela sequência decrescente de números de  10 à 2 e soma os resultados
				soma += (num * j);
			}
			
			//Verifica se o RESTO da divisão corresponde ao primeiro dígito || Se é igual à 10
			String PrimDigitoString = String.valueOf(string.charAt(9));
			int PrimDigito = Integer.parseInt(PrimDigitoString);
			double resto = (soma * 10)%11;
			if (resto == 10) {
				resto = 0;
			} 
			if (resto == PrimDigito) {
				
				//****Verificação do segundo dígito****
				soma = 0;
				for(i = 0, j = 11; i <= 9; i++, j--) { //Percorre por cada caractere
					
					//Transforma index CHAR em INT
					char index = string.charAt(i);
					int num  = Integer.parseInt(String.valueOf(index));
					//Multiplica-se os 10 primeiros dígitos pela sequência decrescente de números de  11 à 2 e soma os resultados
					soma += (num * j);
				}
				
				//Verifica se o RESTO da divisão corresponde ao segundo dígito
				String SegDigitoString = String.valueOf(string.charAt(10));
				int SegDigito = Integer.parseInt(SegDigitoString);
				resto = (soma * 10)%11;
				if (resto == SegDigito) {
					valido = true;
					
					//Verifica se todos os caracteres são iguais
					int repetidos = 0;
					for(i = 0; i <= 10; i++) { 
						if (string.charAt(0) == string.charAt(i)) {
							repetidos++;
							if(repetidos == 10) {
								valido = false;
							}
						}
					}				
				} else {
					valido = false;
				}	
			}else {
				valido = false;
			}
		}
		return valido;
	}
	
	
	
}
