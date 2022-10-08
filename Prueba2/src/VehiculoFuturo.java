 public class VehiculoFuturo {

        private Double tiempoProlongado, tiempoZ;


        VehiculoFuturo(){}
        VehiculoFuturo( double tiempoProlon,double tiempoZ){
            this.tiempoProlongado=tiempoProlon;
            this.tiempoZ=tiempoZ;

        }

        public Double getTiempoProlongado() {
            return tiempoProlongado;
        }

        public Double getTiempoZ() {
            return tiempoZ;
        }

        public void setTiempoProlongado(Double tiempoProlongado) {
            this.tiempoProlongado = tiempoProlongado;
        }

        public void setTiempoZ(Double tiempoZ) {
            this.tiempoZ = tiempoZ;
        }

        public double calculoAceleracion(){
            Double desaceleracion =29.979;
            double velocidadLuz = 0.331;

            Double resultAceleracion =   velocidadLuz-tiempoProlongado/tiempoZ;
            return resultAceleracion;
        }
        public double calculoDistanciaRecorrida(){
            Double   distanciaRecorrida = tiempoZ * tiempoProlongado;
            return distanciaRecorrida;
        }


    }

