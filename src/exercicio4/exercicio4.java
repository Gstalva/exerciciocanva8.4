package exercicio4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        float[] numero = new float[4];
        float variavel = 0;
        
        for(int i = 0; i <= 3; i++){
            System.out.println("Entre com o valor: ");
            numero[i] = scan.nextFloat();           
        }
          variavel = (numero[0] * numero[1]) - (numero[2] * numero[3]);
        System.out.println("A diferença é: " + variavel);
       }
}