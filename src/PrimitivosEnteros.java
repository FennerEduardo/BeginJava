public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde a = " + Byte.BYTES);
        System.out.println("Tipo bits corresponde a = " + Byte.SIZE);
        System.out.println("Tipo byte valor max = " + Byte.MAX_VALUE);
        System.out.println("Tipo byte valor min = " + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo Short corresponde a = " + Short.BYTES);
        System.out.println("Tipo bits corresponde a = " + Short.SIZE);
        System.out.println("Tipo Short valor max = " + Short.MAX_VALUE);
        System.out.println("Tipo Short valor min = " + Short.MIN_VALUE);

        int numeroInt = 400000;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde a = " + Integer.BYTES);
        System.out.println("Tipo bits corresponde a = " + Integer.SIZE);
        System.out.println("Tipo int valor max = " + Integer.MAX_VALUE);
        System.out.println("Tipo int valor min = " + Integer.MIN_VALUE);

        long numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde a = " + Long.BYTES);
        System.out.println("Tipo bits corresponde a = " + Long.SIZE);
        System.out.println("Tipo long valor max = " + Long.MAX_VALUE);
        System.out.println("Tipo long valor min = " + Long.MIN_VALUE);

        // La definición de variables con var por defecto es un entero si se requiere un valor más grande se debe agregar la L de long
        var numeroVar = 2147483648L;
        System.out.println("numeroVar = " + numeroVar);
        numeroVar = 9223372036854775807L;
        System.out.println("numeroVar = " + numeroVar);
    }
}
