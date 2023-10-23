import javax.swing.*;

public class SistemasNumericosDinamicos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");

        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numeroDecimal + Integer.toBinaryString(numeroDecimal)" +  "= " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numeroBinario + Integer.toOctalString(numeroDecimal) = " + numeroBinario + " " +  Integer.toOctalString(numeroDecimal));
        System.out.println("numeroBinario + Integer.toHexString(numeroDecimal) = " + numeroBinario + " " +  Integer.toHexString(numeroDecimal));

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = "Conversiones: \n\r";
        mensaje += "Binario " + Integer.toBinaryString(numeroDecimal) + "\n" +
                "\n";
        mensaje += "Octal "+  Integer.toOctalString(numeroDecimal)+ "\n" +
                "\n";
        mensaje += "Hexadecimal "+  Integer.toHexString(numeroDecimal)+ "\n" +
                "\n";
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
