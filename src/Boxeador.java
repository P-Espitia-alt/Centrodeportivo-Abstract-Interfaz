public class Boxeador extends Atleta implements Evaluable{
    private int golpesAcertados;
    private  int peleasGanadas;

    public Boxeador() {
    }

    public Boxeador(String nombre, int edad, double horasEntrenamiento, int golpesAcertados, int peleasGanadas) {
        super(nombre, edad, horasEntrenamiento);
        this.golpesAcertados = golpesAcertados;
        this.peleasGanadas = peleasGanadas;
    }

    public int getGolpesAcertados() {
        return golpesAcertados;
    }

    public void setGolpesAcertados(int golpesAcertados) {
        this.golpesAcertados = golpesAcertados;
    }

    public int getPeleasGanadas() {
        return peleasGanadas;
    }

    public void setPeleasGanadas(int peleasGanadas) {
        this.peleasGanadas = peleasGanadas;
    }

    @Override
    public String toString() {
        return "Boxeador{" +
                "golpesAcertados=" + golpesAcertados +
                ", peleasGanadas=" + peleasGanadas +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", horasEntrenamiento=" + horasEntrenamiento +
                '}';
    }

    @Override
    public double calcularRendimiento() {
        double rendimiento;
        return rendimiento=(golpesAcertados*0.5)+(peleasGanadas*10);
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
