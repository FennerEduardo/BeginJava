import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre de la factura");
        String nombreFactura = scanner.nextLine();
        System.out.println("Escriba el precio del producto 1" );
        double precio1 = scanner.nextDouble();
        System.out.println("Escriba el precio del producto 2");
        double precio2 = scanner.nextDouble();
        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        System.out.println("La factura " + nombreFactura + " tiene un total bruto de " + totalBruto + ", con un impuesto de " + impuesto + "y el monto después de impuesto es de " +  totalNeto);
        
        
    }
}
