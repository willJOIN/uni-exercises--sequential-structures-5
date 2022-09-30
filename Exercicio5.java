import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        float valorMetro, valorCentimetro = 0;

        try {
            System.out.println("Digite o valor em metros:\n");
            Scanner scanner1 = new Scanner(System.in);
            valorMetro = scanner1.nextFloat();

            valorCentimetro = valorMetro * 100;
        } catch (Exception ex) {
            System.out.println("Erro ao pegar valorCentimetro e/ou valorMetro no Exercicio5:\n" + ex);
        }
        System.out.println("O valor em centimetros eh:\n" + valorCentimetro);
    }
}