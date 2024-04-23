package Lucas;

public class Main {
    public static void main (String[] args) {
        EjecutivosVentas jefeEjecutivo = new EjecutivosVentas("Juanjo", 48, "España", 80);
        System.out.println("El jefe de la zona Ejecutiva tiene un salario estimado de: " + jefeEjecutivo.calcularSalario() + " al mes");
        EjecutivosVentas ejecutivo1 = new EjecutivosVentas("Ivan", 24, "España", 35);
        System.out.println("Ivan tiene un salario estimado de: " + ejecutivo1.calcularSalario() + " al mes");

        EspecialistaRRHH jefeRH = new EspecialistaRRHH("Atlas", 27, 4, 10);
        System.out.println("\nLa jefa de la zona de RH tiene un salario de: " + jefeRH.calcularSalario() + " al mes");
    }
}
