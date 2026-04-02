public class Voleibolista extends Atleta implements Evaluable{
    private int saquesEfectivos;
    private int bloqueos;

    public Voleibolista() {
    }

    public Voleibolista(String nombre, int edad, double horasEntrenamiento, int saquesEfectivos, int bloqueos) {
        super(nombre, edad, horasEntrenamiento);
        this.saquesEfectivos = saquesEfectivos;
        this.bloqueos = bloqueos;
    }

    public int getSaquesEfectivos() {
        return saquesEfectivos;
    }

    public void setSaquesEfectivos(int saquesEfectivos) {
        this.saquesEfectivos = saquesEfectivos;
    }

    public int getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(int bloqueos) {
        this.bloqueos = bloqueos;
    }

    @Override
    public String toString() {
        return "Voleibolista{" +
                "saquesEfectivos=" + saquesEfectivos +
                ", bloqueos=" + bloqueos +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", horasEntrenamiento=" + horasEntrenamiento +
                '}';
    }

    @Override
    public double calcularRendimiento() {
        double rendimiento;
        return rendimiento=(saquesEfectivos*2)+(bloqueos*3);
    }

    @Override
    public void clasificarNivel() {
        if(calcularRendimiento() == 30){
            System.out.println("Nivel: Básico");
        }else if(calcularRendimiento() > 30 && calcularRendimiento() < 70){
            System.out.println("Nivel: Competente");
        } else if (calcularRendimiento() >= 70) {
            System.out.println("Nivel: Elite");
        }
    }

    @Override
    public void calcularBono() {
        if(calcularRendimiento() == 30){
            System.out.println("Nivel: Básico"+'\n'+
                    "Bono Básico: 50000");
        }else if(calcularRendimiento() > 30 && calcularRendimiento() < 70){
            System.out.println("Nivel: Competente"+'\n'+
                    "Bono Competente: 150000");
        } else if (calcularRendimiento() >= 70) {
            System.out.println("Nivel: Elite"+'\n'+
                    "Bono Elite: 300000");
        }
    }
}
