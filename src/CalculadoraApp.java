import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            try {
                var operador = Integer.parseInt(consola.nextLine());
                if (operador >= 1 && operador <= 4) {
                    //Ejecutando operacion solicitada
                    ejecutarOperacion(operador, consola);
                } else if (operador == 5) {
                    System.out.println("Hasta pronto");
                    break;
                } else {
                    System.out.println("Operacion '" + operador + "' incorrecto, seleccionar entre 1 y 4");
                }//fin else
                //imprimir salto de linea
                System.out.println("/n");
            } catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }//fin de while
    }//fin main


    private static void mostrarMenu(){
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
    }//fin funcion mostrarMenu


    private  static void ejecutarOperacion(int operador, Scanner consola){
        System.out.print("Proporciona el primer valor: ");
        var valor1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona el segundo valor: ");
        var valor2 = Double.parseDouble(consola.nextLine());
        Double resultado;
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
            default ->
                    System.out.println("Operacion '" + operador + "' incorrecto, seleccionar entre 1 y 4");
        }
    }//fin funcion ejecutarperacion

}//fin clase