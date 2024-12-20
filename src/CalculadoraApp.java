import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        while (true) {
        System.out.println("**** Aplicación Calculadora ****");
        //MENU
            System.out.println("""
                    1.Suma
                    2.Resta
                    3.Division
                    4.Multiplicacion
                    5.Salir
                    """);

            System.out.print("Proporciona operacion que deseas realizar: ");
            var operador = Integer.parseInt(consola.nextLine());
            if (operador >= 1 && operador <= 4) {
                System.out.print("Proporciona el primer valor: ");
                var valor1 = Integer.parseInt(consola.nextLine());
                System.out.print("Proporciona el segundo valor: ");
                var valor2 = Integer.parseInt(consola.nextLine());
                int resultado;
                switch (operador) {
                    case 1 -> {
                        resultado = valor1 + valor2;
                        System.out.println("Resultado Suma: " + resultado);
                    }
                    case 2 -> {
                        resultado = valor1 - valor2;
                        System.out.println("Resultado Resta: " + resultado);
                    }
                    case 3 -> {
                        resultado = valor1 / valor2;
                        System.out.println("Resultado Division: " + resultado);
                    }
                    case 4 -> {
                        resultado = valor1 * valor2;
                        System.out.println("Resultado Multiplicacion: " + resultado);
                    }
                    default -> System.out.println("Operacion '" + operador + "' incorrecto, seleccionar entre 1 y 4");
                }
            } else if (operador == 5) {
                System.out.println("Hasta pronto");
                break;
            } else {
                System.out.println("Operacion '" + operador + "' incorrecto, seleccionar entre 1 y 4");
            }//fin else
            //imprimir salto de linea
            System.out.println("/n");
        }//fin de while
    }//fin main
}//fin clase