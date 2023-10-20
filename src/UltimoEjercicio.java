import java.util.Scanner;

public class UltimoEjercicio {
    public static void main(String[] args) {
        //Definir las variables
        String nombre, dni, direccion;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba el nombre -> ");
        nombre = teclado.nextLine();
        System.out.println("Escriba el DNI -->");
        dni = teclado.nextLine();
        System.out.println("Escriba la dirección ->");
        direccion = teclado.nextLine();

        System.out.println("nombre : " + nombre + " con DNI : " + dni + " vive en " + direccion);
    }
}
