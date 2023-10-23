public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        boolean InstanceClass = Boolean.TRUE;

        System.out.println("datoLogico = " + datoLogico);
        System.out.println("InstanceClass = " + InstanceClass);

        double d = 98765.43e-3; // 98.76543
        float f = 1.23456e2f; //123.45

        datoLogico = (d > f);
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-2) == 1;
        System.out.println("esIgual = " + esIgual);
    }
}
