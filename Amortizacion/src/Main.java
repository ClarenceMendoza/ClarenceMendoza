import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner entrada;
            entrada = new Scanner(System.in);

            System.out.println("Ingrese el monto del prestamo x");
            Double monto = entrada.nextDouble();

            /* if (monto >= 2000) {
                System.out.println("Su monto de prestamo esta dentro del rango" + monto);
            }
            if (monto > 2000) {
            }*/



            /*tiempo de duracion del prestamo*/

            System.out.print("Ingrese el tiempo de su prestamo en meses ");
            System.out.println("Tiempo minimo 24 meses // Tiempo Maximo 360  ");
            Double Mes = entrada.nextDouble();

            /* if (Mes >= 24 || Mes < 360) {
                System.out.println("Su prestamo esta dentro del rango mensual" + Mes);

*/
                // Amortizacion del prestramo

                Amortizacion obj = new  Amortizacion(monto, Mes);

                //Capital

                System.out.println("su resultado del capital es " + obj.tasa());


                // Interes total cobrado
                System.out.println("su resultado la amortizacion es " + monto * Mes);

                //Renta

                System.out.println("su resultado de el interes mensual cobrado es " + obj.tasa() / Mes);

                //Detalles adicional

                System.out.println("su resultado de cantidad de meses del prestamo ");


                System.out.println("Detalles Adicionales del prestamo");


            }
        }

