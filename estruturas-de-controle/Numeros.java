import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o Número \n");
        Integer number = scanner.nextInt();
        while (true) {
            System.out.println("Informe o número para verificação \n");
            Integer toVerify = scanner.nextInt();
            if (toVerify < number) {
                System.out.printf("Informe um número maior que %s \n", number);
                continue;
            }
            Integer result = toVerify % number;
            System.out.printf("%s %% %s = %s", toVerify, number, result);
            if (result != 0)
                break;
        }
    }

}
