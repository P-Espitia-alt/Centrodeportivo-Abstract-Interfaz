public abstract class Atleta {
    protected String nombre;
    protected int edad;
    protected double horasEntrenamiento;

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre +'\n'+
                "Edad: "+edad+'\n'+
                "Horas de Entrenamiento: "+horasEntrenamiento);
    }

    public abstract double calcularRendimiento();

}
