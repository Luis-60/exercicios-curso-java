import java.util.Scanner;

public class IMC {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua altura");
        Float altura = scanner.nextFloat();
        System.out.println("Informe seu peso");
        Float peso = scanner.nextFloat();
        Float imc = peso/(altura*altura);
        String msg = "";
        if(imc < 18.5){
            msg = "Abaixo do peso";
        } else if (imc >= 18.6 && imc <= 24.9){
            msg = "Peso ideal";
        } else if (imc >= 25.0 && imc <= 29.9){
            msg = "Levemente acima do peso";
        } else if (imc >= 30.0 && imc <= 34.9){
            msg = "Obesidade Grau I";
        } else if (imc >= 35.0 && imc <= 39.9){
            msg = "Obesidade Grau II";
        } else if (imc >= 40.0 ){
            msg = "Obesidade Grau III";
        }
        System.out.println(msg);
    }
}
