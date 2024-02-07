package exercicio3;
	import java.util.Scanner;
		public class exercicio3 {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				float[] pagamentos = new float[4];
				float salarioLiquido = 0;
					String texto = "Digite o salário bruto: ";
					for(int i = 0; i <= 3; i++){
						System.out.println(texto);
						pagamentos[i] = scan.nextFloat();
						if(i == 0) {
							texto = "Digite o adicional noturno: ";
						}
							if(i == 1) {
							texto = "Digite as horas extras: ";
							}
							if(i == 2) {
								texto = "Digite os descontos: ";
							}           
					}
					salarioLiquido = pagamentos[0] + pagamentos[1] + (pagamentos[2] * 5) - pagamentos[3];
					System.out.println("O salário liquido é: " + String.format("%.1f",salarioLiquido));
	}
}