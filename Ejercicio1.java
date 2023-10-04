import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce valor para a: ");
        int a = entrada.nextInt();

        System.out.println("introduce valor para b :");
        int b = entrada.nextInt();

        int c = entrada.nextInt();

        entrada.close();

        System.out.println("operacion a: ");
        int solua =  a*b + c*((3-a)/(2*b));
        System.out.println(solua);

        System.out.println("operacion b: ");
        int solub = ((2+a*b)/4)^(c+2);
        System.out.println(solub);

        System.out.println("operacion c: ");
        String soluc = "no se hacer la raiz cuadrada en java";
        System.out.println(soluc);


    }
}
