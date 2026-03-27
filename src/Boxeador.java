public class Boxeador extends Atleta implements Evaluable{
    private int golpesAcertados;
    private  int peleasGanadas;

    @Override
    public double calcularRendimiento() {
        double rendimiento;
        return rendimiento=(golpesAcertados*0.5)+(peleasGanadas*10);
    }

    @Override
    public void clasificarNivel() {

    }

    @Override
    public void calcularBono() {

    }
}
