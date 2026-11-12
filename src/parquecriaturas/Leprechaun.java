package parquecriaturas;

public class Leprechaun extends Duende {

    private int nivelSuerte;

    public Leprechaun(String nombre, int edad, int energia,
                      int nivelSuerte) {

        super(nombre, edad, energia);
        this.nivelSuerte = nivelSuerte;
    }

    public void invocarSuerte() {
        if (getNivelEnergia() >= 10) {
            consumirEnergia(10);
            System.out.println(getNombre() +
                " invoca un hechizo de suerte. Nivel: " + nivelSuerte);
        } else {
            System.out.println(getNombre() +
                " no tiene energia suficiente.");
        }
    }

    @Override
    public void realizarActividadPrincipal() {
        invocarSuerte();
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
               " | Nivel de suerte: " + nivelSuerte;
    }
}
