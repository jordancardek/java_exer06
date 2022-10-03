import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scan.nextDouble();

        scan.close();

        double area = Math.PI * Math.pow(raio,2);
        
        System.out.println("O valor da area e: "+area);
    }
}