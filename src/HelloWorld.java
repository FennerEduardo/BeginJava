import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        String grettings = "Hello World!! and welcome!";
        System.out.println(grettings);
        System.out.println("grettings.toUpperCase() =  " + grettings.toUpperCase());

        // Variables tipadas
        int numero = 10;
        int numero2 = 5;
        boolean valor = true;


        System.out.println("numero = " + numero);

        if(valor){            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        // variable dinámica
        var numero3 = 15;
        System.out.println("numero3 = " + numero3);

        String nombre;

        nombre = "Fenner";

        if(numero <= 10){
            nombre = "Lina";
        }
        System.out.println("nombre = " + nombre);
    }
}