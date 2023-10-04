import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("numero de pizzas que se han encargado: ");
        int pizza = entrada.nextInt();

        System.out.println("numero de amigos: ");
        int amigos = entrada.nextInt();

        System.out.println("numero de porciones por pizza: ");
        int porcionesPizza = entrada.nextInt();

        entrada.close();

        int porcionesTotal = porcionesPizza * pizza;

        int porcionesPersona = porcionesTotal/amigos;

        System.out.println("para " + amigos + " amigos, tocaran a " + porcionesPersona + " porciones por persona al pedir " + pizza + " pizzas y cortarla en " + porcionesPizza + " porciones");

    }
}
