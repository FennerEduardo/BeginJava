public class ConversionDeTipos {
    public static void main(String[] args) {
//        Convertir strings a primitivos
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43";
        double realdouble = Double.parseDouble(realStr);
        System.out.println("realdouble = " + realdouble);

        String realStr2 = "98765.43e-3";
        double realdouble2 = Double.parseDouble(realStr2);
        System.out.println("realdouble2 = " + realdouble2);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        var varNumeroStr = "50";
        var varNumeroInt = Integer.parseInt(varNumeroStr);
        System.out.println("varNumeroInt = " + varNumeroInt);

        var varRealStr = "98765.43";
        var varRealdouble = Double.parseDouble(varRealStr);
        System.out.println("varRealdouble = " + varRealdouble);

        var varRealStr2 = "98765.43e-3";
        var varRealdouble2 = Double.parseDouble(varRealStr2);
        System.out.println("varRealdouble2 = " + varRealdouble2);

        var varLogicoStr = "true";
        var varLogicoBoolean = Boolean.parseBoolean(varLogicoStr);
        System.out.println("varLogicoBoolean = " + varLogicoBoolean);

//        convertir enteros en strings
        int otroInt = 100;
        System.out.println("otroInt = " + otroInt);
        String otroString = Integer.toString(otroInt);
        System.out.println("otroString = " + otroString);
        otroString = String.valueOf(otroString);
        System.out.println("otroString = " + otroString);
        otroString = String.valueOf(otroInt + 10);
        System.out.println("otroInt = " + otroString);
        otroString = String.valueOf(otroString + 10);
        System.out.println("otroString = " + otroString);

        double otroReal = 1.23456e3;
        String otroRealStr = Double.toString(otroReal);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(otroReal);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.234567e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        // Conversion entre primitivos, posible perdida de información, según se convierta el tipo
        //casteo
        int integer = 22768;
        System.out.println("integer = " + integer);
        short sh = (short)integer;
        System.out.println("sh = " + sh);
        long lng = integer;
        System.out.println("lng = " + lng);
        
        char ch = (char) integer;
        System.out.println("ch = " + ch);

        float fl = (float) integer;
        System.out.println("fl = " + fl);
    }
}
