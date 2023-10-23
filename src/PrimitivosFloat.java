public class PrimitivosFloat {
    static float varFlotante;
    public static void main(String[] args) {
        float realFloat = 1;
        System.out.println("realFloat = " + realFloat);
        realFloat = 1.5f;
        System.out.println("realFloat = " + realFloat);
        realFloat = 2.12e3f; //2120f
        System.out.println("realFloat = " + realFloat);
        realFloat = 2.12e-3f; //0.00212f
        System.out.println("realFloat = " + realFloat);

        System.out.println("Tipo float corresponde a = " + Float.BYTES);
        System.out.println("Tipo bits corresponde a = " + Float.SIZE);
        System.out.println("Tipo float valor max = " + Float.MAX_VALUE);
        System.out.println("Tipo float valor min = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde a = " + Double.BYTES);
        System.out.println("Tipo bits corresponde a = " + Double.SIZE);
        System.out.println("Tipo double valor max = " + Double.MAX_VALUE);
        System.out.println("Tipo double valor min = " + Double.MIN_VALUE);

//        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
    }
}
