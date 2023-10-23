public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'a';
        char decimal = 64;
        char simbolo = '@';
        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        
        // para obtener el separador de línea nativo del SO usar
        System.out.println("System.getProperty(\"line.separator\") + \"aqui\" = " + System.getProperty("line.separator") + "aqui");
        System.out.println("System.lineSeparator() + \"aqui\" = " + System.lineSeparator() + "aqui");

        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        caracter = '\u0040';
        System.out.println("caracter = " + caracter);
        System.out.println("(decimal == caracter) = " + (decimal == caracter));
        System.out.println("(simbolo == caracter) = " + (simbolo == caracter));

        System.out.println("espacio =" + espacio  + espacio + "aqui");
        System.out.println("retroceso" + retroceso);
        System.out.println("tabulador = " + tabulador + " aqui");
        System.out.println("nuevaLinea + \"aqui\" = " + nuevaLinea + "aqui");
        System.out.println("retornoCarro + \"Aqui\" = " + retornoCarro + "Aqui");


        System.out.println("Character.BYTES = " + Character.BYTES);
        System.out.println("Character.SIZE = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
    }
}
