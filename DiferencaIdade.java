import java.time.OffsetDateTime;
import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) throws Exception {
        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro nome");
        var name1 = scanner.next();
        System.out.println("Informe o segundo nome");
        var name2 = scanner.next();
        
        System.out.println("Informe a primeira idade");
        var year1 = scanner.nextInt();
        System.out.println("Informe a segunda idade");
        var year2 = scanner.nextInt();
        var diff = Math.abs(year1 - year2);
        System.out.printf("O %s possui %s anos, e o %s possui %s anos, sabendo disso, a diferença de idade dos dois é de %s anos \n", 
        name1, year1, name2, year2, diff);




    }
}

