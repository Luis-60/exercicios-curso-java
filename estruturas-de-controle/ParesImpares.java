import java.util.*;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTRE COM UM NÚMERO");
        Integer one = scanner.nextInt();
        System.out.println("Você quer que seja informado valor par ou impar?");
        String paresOuImpares = scanner.next();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(one);
        while (true) {
            System.out.println("ENTRE COM O SEGUNDO NÚMERO");
            Integer second = scanner.nextInt();
            
            if (second < one) {
                numbers.add(second);
                System.out.printf("Informe um número maior que %s \n", one);
                continue;
            }
            numbers.add(second);

            if (second > one) {
                System.out.printf("Tal qual informado anteriormente, você escolheu %s, irei imprimí-los \n", paresOuImpares);
                Collections.sort(numbers, Collections.reverseOrder());
                if (paresOuImpares.equalsIgnoreCase("par")) {
                    for (Integer number : numbers) {
                        if (number % 2 == 0) {
                            System.out.println(number);
                        } 
                    }
                } else if (paresOuImpares.equalsIgnoreCase("impar")){
                    for (Integer number : numbers) {
                        if (number % 2 != 0) {
                            System.out.println(number);
                        } 
                    }
                }
                break;
            }

        }

    }
}