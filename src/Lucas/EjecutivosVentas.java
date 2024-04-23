package Lucas;

public class EjecutivosVentas extends Empleado{
    private String zonaGeografica;
    private int ventasRealizadas;

    public EjecutivosVentas(String nombre, int edad, String zonaGeografica, int ventasRealizadas) {
        super(nombre, edad);
        this.zonaGeografica = zonaGeografica;
        this.ventasRealizadas = ventasRealizadas;
    }
    public int calcularSalario() {
        int salarioBase = 900;
        int comision = ventasRealizadas * 50;
        return salarioBase + comision;
    }
}
