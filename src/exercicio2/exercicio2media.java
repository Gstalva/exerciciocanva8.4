package exercicio2;

import java.util.Scanner;

public class exercicio2media {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        float[] nota = new float[4];
        float media = 0;      

        for(int i = 0; i <= 3; i++){
            System.out.println("Digite a nota: ");
            nota[i] = scan.nextFloat();
            media = media + nota[i];
        }

        media = media / 4;
        System.out.println("A média é: "+ String.format("%.1f",media));
    }
}
