public class Ciclista extends Atleta implements Evaluable{
   private double kilometrosRecorridos;
   private double tiempoHoras;

    public Ciclista() {
    }

    public Ciclista(String nombre, int edad, double horasEntrenamiento, double kilometrosRecorridos, double tiempoHoras) {
        super(nombre, edad, horasEntrenamiento);
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.tiempoHoras = tiempoHoras;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public double getTiempoHoras() {
        return tiempoHoras;
    }

    public void setTiempoHoras(double tiempoHoras) {
        this.tiempoHoras = tiempoHoras;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "kilometrosRecorridos=" + kilometrosRecorridos +
                ", tiempoHoras=" + tiempoHoras +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", horasEntrenamiento=" + horasEntrenamiento +
                '}';
    }

    @Override
    public double calcularRendimiento() {
        double rendimiento;
        return rendimiento=(kilometrosRecorridos/tiempoHoras);
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
