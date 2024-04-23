package Lucas;

public class EspecialistaRRHH extends Empleado {
    private int experiencia;
    private int contratacionesExitosas;
    public EspecialistaRRHH(String nombre, int edad, int experiencia, int contratacionesExitosas) {
        super(nombre, edad);
        this.experiencia = experiencia;
        this.contratacionesExitosas = contratacionesExitosas;
    }
    public int calcularSalario() {
        int salarioBase = 800;
        int bono = contratacionesExitosas * 50;
        return salarioBase + bono;
    }
}
