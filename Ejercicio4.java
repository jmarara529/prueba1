import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce tres numeros enteros: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        entrada.close();

        string maximo = (a>b) ? (a>c) ? a : (b>c) ? b : c ;
        string minimo = (a<b ? (a<c) ? a : (b<c) ? b : c ;
        String medio = (a<b && a>c) ? a : (b<a && b>c) ? b : c;

        System.out.println("valor minimo :" + minimo);
        System.out.println("valor maximo: " + maximo);
        System.out.println("valor medio: " medio);
    }
}
