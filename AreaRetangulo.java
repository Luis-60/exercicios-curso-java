import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite a base do retângulo");
        var base = scanner.nextFloat();
        System.out.println("Digite a altura do retângulo");
        var altura = scanner.nextFloat();
        System.out.printf("Com a altura %s, a base %s a área do retângulo é: %s \n", altura, base, altura * base);


    }
    
}

