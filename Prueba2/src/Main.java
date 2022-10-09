import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;
public class Main {
    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in);

        System.out.println("ingrese el tiempo prolongado x");
        Double tiempoPro= entrada.nextDouble();

        System.out.println("ingrese el tiempo prolongado z");
        Double tiempoZz= entrada.nextDouble();


        VehiculoFuturo obj = new VehiculoFuturo(tiempoPro,tiempoZz);


        System.out.printf( "El valor de la aceleracion es: %.2f km/s",  obj.calculoAceleracion() ) ;
        System.out.println("  ");
        System.out.printf( "El valor de la aceleracion es: %.1f km/s", obj.calculoDistanciaRecorrida() );

    }
}

