import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // leitor da entrada padrao do sistema
        Scanner scanner = new Scanner(System.in);

        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();

       double pesoA = 3.5;
       double pesoB = 7.5;
       double somaDosPesos = pesoA + pesoB;

        double media = (notaA * pesoA + notaB * pesoB) / (somaDosPesos);

        // System.out.println("MEDIA = " + media); -> CONCATENAÇÃO
        System.out.printf("MEDIA = %.5f\n", media);
    }
}