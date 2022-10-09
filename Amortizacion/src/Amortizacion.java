    public class Amortizacion {

        private Double cuotaMensual, interesMensual, mensualidad,tiempo;

        Amortizacion(double tasaPeriodica, double interesMensual,double tiempo,double cuotaMensual) {
            this.mensualidad = tasaPeriodica;
            this.interesMensual = interesMensual;
            this.tiempo = tiempo;
            this.cuotaMensual = cuotaMensual;

         }

        public Amortizacion(Double monto, Double Mes) {
        }

        public Double getInteresMensual () {
            return interesMensual;
        }
        public Double getCuotaMensual (){
            return cuotaMensual;
        }

        public Double gettasaPeriodica() {
            return tiempo;
        }

        public double Interes () {
            Double Interes = cuotaMensual * interesMensual;
            return Interes;
        }
            public double tasa () {
                Double tasa = cuotaMensual - interesMensual;
                return tasa;
            }



    }
