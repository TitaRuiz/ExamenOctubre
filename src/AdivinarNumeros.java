import java.util.Random;
import java.util.Scanner;

public class AdivinarNumeros {
    public static void main(String[] args) {
        //Realizar un juego para adivinar un número calcular el numero a adivinar
        //con la clase Random (1 al 10)  y luego ir pidiendo numeros indicando
        //si es mayor o menor con respecto al numero a adivinar
        //El proceso termina cuando el usuario acierta
        //1. Declarar variables
        //Primitivas
        int numeroAPedir=0, numeroAAdivinar;
        //De instancia
        Random numeroAleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        numeroAAdivinar = numeroAleatorio.nextInt(1,11);
        //System.out.println("Numero a adivinar " + numeroAAdivinar);

        while (numeroAPedir!=numeroAAdivinar){
            System.out.println("Escriba un número ->");
            numeroAPedir = teclado.nextInt();
            if(numeroAPedir>numeroAAdivinar){
                System.out.println("El numero pedido es mayor al de adivinar");
            }else if(numeroAPedir < numeroAAdivinar){
                System.out.println("El numero pedido es menor al de adivinar");
            }else{
                System.out.println("Enhorabuena a adivinado");
            }
        }

    }
}
