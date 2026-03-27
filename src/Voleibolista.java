public class Voleibolista extends Atleta implements Evaluable{
    private int saquesEfectivos;
    private int bloqueos;

    @Override
    public double calcularRendimiento() {
        double rendimiento;
        return rendimiento=(saquesEfectivos*2)+(bloqueos*3);
    }

    @Override
    public void clasificarNivel() {

    }

    @Override
    public void calcularBono() {

    }
}
