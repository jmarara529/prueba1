import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce valor para a: ");
        double a = entrada.nextDouble();

        System.out.println("introduce valor para b :");
        double b = entrada.nextDouble();

        double c = entrada.nextDouble();

        entrada.close();

        System.out.println("operacion a: ");
        double solua =  a*b + c*((3-a)/(2*b));
        System.out.println(solua);

        System.out.println("operacion b: ");
        double solub = ((2+a*b)/4)^(c+2);
        System.out.println(solub);

        System.out.println("operacion c: ");
        String soluc = "no se hacer la raiz cuadrada en java";
        System.out.println(soluc);


    }
}
