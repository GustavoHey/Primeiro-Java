import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Define os valores de A, B e C.
        int valorah, valorbe, valorce;

        System.out.println("");

        System.out.println("digite o valor de A");
        valorah = sc.nextInt();
        System.out.println("digite o valor de B");
        valorbe = sc.nextInt();
        System.out.println("digite o valor de C");
        valorce = sc.nextInt();
        // verifica se o valor é menor
        if ((valorah + valorbe) < valorce) {
            System.out.println("a soma de a+b e menor que c!");
        }
        // verifica se o valor é maior
        if ((valorah + valorbe) >= valorce) {
            System.out.println("a soma de a+b nao e menor que c!");
        }
    }
}