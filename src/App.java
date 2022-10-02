import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner e = new Scanner(System.in);

       System.out.println("Digite o primeiro numero: ");
       double a = e.nextDouble();

       System.out.println("Digite o segundo numero: ");
       double b = e.nextDouble();

       System.out.println("Digite o terceiro numero: ");
       double c = e.nextDouble();

       System.out.println("Digite o quarto numero: ");
       double d = e.nextDouble();
       e.close();

       double media = (a + b + c + d)/4;
       System.out.println("O resultado e: " + media);

        
    }
}
