import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("**** Aplicación Calculadora ****");
        //MENU
        System.out.println("""
                1.Suma
                2.Resta
                3.Division
                4.Multiplicacion
                """);

        System.out.println("Proporciona operacion que deseas realizar: ");
        var operador = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona el primer valor: ");
        var valor1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona el segundo valor: ");
        var valor2= Integer.parseInt(consola.nextLine());
        var resultado = valor1 + valor2;



        System.out.println("Resultado: " + resultado);
    }
}
