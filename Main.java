import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = "alugmtexto";
        double numerodecimal = 2.0;
        char letra = 'b';
        boolean tipologico = true;
        int num2 = 10;
        float numerodecimalextenso = 1.01F;


        System.out.println("qual operacao voce deseja? 1-Soma 2-Subtracao 3-Divisao 4-vezes");
        int escolha = sc.nextInt();

        int primeironumero, segundonumero;

        System.out.println("digite o primeiro numero");
        primeironumero = sc.nextInt();
        System.out.println("digite o segundo numero");
        segundonumero = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Resultado: " + soma(primeironumero, segundonumero));
                sc.close();
                break;

            case 2:
                System.out.println("Resultado: " + subt(primeironumero, segundonumero));
                sc.close();
                break;

            case 3:
                System.out.println("Resultado: " + divis(primeironumero, segundonumero));
                sc.close();
                break;

            case 4:
                System.out.println("Resultado: " + vezes(primeironumero, segundonumero));
                sc.close();
                break;
        }

 sc.close();

    }


    /**
     * Essa funcão soma dois numeros e os exibe
     * @param primeironumero primeiro numero a ser somado
     * @param segundonumero segundo numero a ser somado
     * @return a soma dos dois numeros
     */
    public static int soma(int primeironumero, int segundonumero){
        return primeironumero + segundonumero;
    }

    /**
     * Essa Função é responsavel por fazer subtração.
     * @param num1 primeiro valor inserido
     * @param num2 primeiro valor inserido
     * @return a subtração dos valores
     */
    public static int subt(int num1, int num2){
        return num1 - num2;
    }

    /**
     * Está função é resposa por dividir os numeros
     * @param num1 primeiro valor inserido
     * @param num2 segundo valor inserido
     * @return a divisão dos valores
     */
    public static double divis(double num1, double num2){ return num1/num2; }

    /**
     * Está função é responsavel por multiplicar os valores
     * @param num1 primeiro valor inserido
     * @param num2 segundo valor inserido
     * @return a multiplicação dos valores
     */
    public static int vezes(int num1, int num2){
        return num1 * num2;
    }
}
