import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosDinamicosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
//        String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        try{
//            numeroDecimal = Integer.parseInt(numeroStr);
            numeroDecimal = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String mensaje = "Conversiones: \n\r";

        mensaje += "Binario " + Integer.toBinaryString(numeroDecimal) + "\n" +
                "\n";
        mensaje += "Octal "+  Integer.toOctalString(numeroDecimal)+ "\n" +
                "\n";
        mensaje += "Hexadecimal "+  Integer.toHexString(numeroDecimal)+ "\n" +
                "\n";
        System.out.println(mensaje);

    }
}
