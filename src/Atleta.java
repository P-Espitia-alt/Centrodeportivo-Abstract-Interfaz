public abstract class Atleta {
    protected String nombre;
    protected int edad;
    protected double horasEntrenamiento;

    public Atleta() {
    }

    public Atleta(String nombre, int edad, double horasEntrenamiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.horasEntrenamiento = horasEntrenamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getHorasEntrenamiento() {
        return horasEntrenamiento;
    }

    public void setHorasEntrenamiento(double horasEntrenamiento) {
        this.horasEntrenamiento = horasEntrenamiento;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", horasEntrenamiento=" + horasEntrenamiento +
                '}';
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre +'\n'+
                "Edad: "+edad+'\n'+
                "Horas de Entrenamiento: "+horasEntrenamiento);
    }

    public abstract double calcularRendimiento();

}
