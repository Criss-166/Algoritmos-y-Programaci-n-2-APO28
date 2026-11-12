package parquecriaturas;

public abstract class Criatura {

    private String nombre;
    private int edad;
    private int nivelEnergia;

    public Criatura(String nombre, int edad, int nivelEnergia) {
        this.nombre = nombre;
        this.edad = edad;

        if (nivelEnergia < 0 || nivelEnergia > 100) {
            throw new IllegalArgumentException(
                "La energia debe estar entre 0 y 100");
        }

        this.nivelEnergia = nivelEnergia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    protected void aumentarEnergia(int cantidad) {
        nivelEnergia = Math.min(100, nivelEnergia + cantidad);
    }

    protected void consumirEnergia(int cantidad) {
        nivelEnergia = Math.max(0, nivelEnergia - cantidad);
    }

    public void alimentarse() {
        aumentarEnergia(20);
        System.out.println(nombre + " se ha alimentado.");
    }

    public void descansar() {
        aumentarEnergia(10);
        System.out.println(nombre + " ha descansado.");
    }

    public abstract void realizarActividadPrincipal();

    public String mostrarInformacion() {
        return "Nombre: " + nombre +
               " | Edad: " + edad +
               " | Energia: " + nivelEnergia;
    }
}
