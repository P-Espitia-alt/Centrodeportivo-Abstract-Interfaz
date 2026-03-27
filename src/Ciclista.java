public class Ciclista extends Atleta implements Evaluable{
   private double kilometrosRecorridos;
   private double tiempoHoras;
    @Override
    public double calcularRendimiento() {
        double rendimiento;
        return rendimiento=(kilometrosRecorridos/tiempoHoras);
    }

    @Override
    public void clasificarNivel() {
        if(calcularRendimiento() == 30){

        }else if(calcularRendimiento() == 30 && calcularRendimiento() == 70){

        }
    }

    @Override
    public void calcularBono() {

    }
}
