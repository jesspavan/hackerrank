package hackerrank;

import java.util.Scanner;

public class Serie {

    public static void main(String[] argh) {

        Scanner in = new Scanner(System.in);
        int numeroSeries = in.nextInt();

        if (numeroSeries < 0 || numeroSeries > 500) {
            System.out.println("Number of interactions not allowed.");
        } else {

            for(int i=0; i<numeroSeries; i++){

                int constante = in.nextInt();;
                int numero = in.nextInt();
                int iteracoes = in.nextInt();
                int soma=constante;
                int multiplicador=1;

                if ((constante < 0) || (constante > 50) || (numero < 0) || (numero > 50) || (iteracoes < 1) || (iteracoes >15) )
                    break;

                for(int j=1; j<=iteracoes; j++){

                    soma = soma + (multiplicador*numero);
                    multiplicador =  multiplicador*2;
                    System.out.print(soma+" ");


                }
                System.out.print("\n");

            }
            in.close();
        }

    }
}
