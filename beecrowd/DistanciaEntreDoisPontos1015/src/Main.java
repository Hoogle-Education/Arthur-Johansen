import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        double x1 = inputReader.nextDouble();
        double y1 = inputReader.nextDouble();
        double x2 = inputReader.nextDouble();
        double y2 = inputReader.nextDouble();

        double difX = x2-x1;
        double difY = y2-y1;

        double distancia = Math.sqrt(difX*difX + difY*difY);

        System.out.printf("%.4f\n", distancia);
    }
}