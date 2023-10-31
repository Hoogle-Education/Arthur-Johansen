import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite algo abaixo");

        var foo1 = input.nextInt();
        var foo2 = input.nextInt();

        System.out.println(foo1 + foo2);

    }
}

// entrada: 1 2 3 4 5
// saida: 2 4 6 8 10

// 1
// 2