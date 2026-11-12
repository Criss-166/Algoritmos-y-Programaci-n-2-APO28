package parquecriaturas;

public class Trasgo extends Duende {

    private int nivelFuerza;

    public Trasgo(String nombre, int edad, int energia,
                  int nivelFuerza) {

        super(nombre, edad, energia);
        this.nivelFuerza = nivelFuerza;
    }

    public void hacerTravesura() {
        if (getNivelEnergia() >= 15) {
            consumirEnergia(15);
            System.out.println(getNombre() +
                " esta haciendo travesuras por el parque.");
        } else {
            System.out.println(getNombre() +
                " no tiene energia suficiente.");
        }
    }

    @Override
    public void realizarActividadPrincipal() {
        hacerTravesura();
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
               " | Nivel de fuerza: " + nivelFuerza;
    }
}
