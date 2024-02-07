package exercicio1;

import java.util.Scanner;

public class exercicio1abono {
	public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        float pagamento, abono, novopagamento;

        System.out.println("Digite seu salário: ");
        pagamento = scan.nextFloat();

        System.out.println("Digite o abono: ");
        abono = scan.nextFloat();

        novopagamento = pagamento + abono;

        System.out.println("O valor do abono mais seu salário é: "+novopagamento);

    }
}