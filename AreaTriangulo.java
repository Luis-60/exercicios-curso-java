import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite a base do triângulo");
        var base = scanner.nextFloat();
        System.out.println("Digite a altura do triângulo");
        var altura = scanner.nextFloat();
        System.out.printf("Com a altura %s, a base %s a área do triângulo é: %s \n", altura, base, altura * base);


    }
    
}
