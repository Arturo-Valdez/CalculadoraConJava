import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        System.out.println("**** Aplicación Calculadora ****");
        //System.out.println("Proporciona operacion que deseas realizar: ");
        System.out.print("Proporciona el primer valor: ");
        Scanner consola = new Scanner(System.in);
        var operando1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona el segundo valor: ");
        var operando2= Integer.parseInt(consola.nextLine());
        var resultado = operando1 + operando2;

        System.out.println("Resultado: " + resultado);
    }
}
