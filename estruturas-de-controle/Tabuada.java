import java.util.Scanner;

public class Tabuada {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número para ter a tabuada dele");
    Integer number = scanner.nextInt();

    for(Integer i = 1; i <= 10; i++){
        Integer result = number * i;
        System.out.printf("%s x %s = %s \n", number, i, result);

    }
   }
}
