import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int edad = 18;
       double sueldo = 1_200;
       char sexo = 'M';

        System.out.println("La edad es -> " + edad);
        System.out.println("El sueldo es -> " + sueldo);
        System.out.println("El sexo es -> " + sexo);

        int hora = -4;
        if(hora >=0 && hora<=12){
            System.out.println("Buenos días");
        }else if(hora>12 && hora<=24){
            System.out.println("Buenas noches");
        } else{
            System.out.println("Valor invalido");
        }

        double precio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el precio --> ");
        precio = teclado.nextDouble();

        for(int i = 10;i>=0;i--){
            System.out.println(i);
        }

        teclado.close();

    }
}