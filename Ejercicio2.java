import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce la temperatura en ºC :");
        double cent = entrada.nextDouble();

        double fah =(9/5)*cent+32;
        double kel = cent+273.15;

        System.out.println("introduce F si quieres en fahrenheit o K si lo quieres en kelvin: ");

        String salida = entrada.nextLine();

        String resultado = (salida = "F" || salida = "f") ? ("la temperatura introducida en fahrenheit es " + fah) :
                (salida = "K" || salida = "k") ? ("la temperatura introducida en kelvin es " + kel) : "no se ha introducido el formato indicado";

        System.out.println(resultado);

    }
}
