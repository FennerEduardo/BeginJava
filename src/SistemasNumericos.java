public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
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
     
    }
}
