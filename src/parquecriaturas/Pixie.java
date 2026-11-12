package parquecriaturas;

public class Pixie extends Duende {

    private double tamanoAlas;

    public Pixie(String nombre, int edad, int energia,
                 double tamanoAlas) {

        super(nombre, edad, energia);
        this.tamanoAlas = tamanoAlas;
    }

    public void esparcirPolvoMagico() {
        if (getNivelEnergia() >= 12) {
            consumirEnergia(12);
            System.out.println(getNombre() +
                " esparce polvo magico por el parque.");
        } else {
            System.out.println(getNombre() +
                " no tiene energia suficiente.");
        }
    }

    @Override
    public void realizarActividadPrincipal() {
        esparcirPolvoMagico();
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
               " | Tamano de alas: " + tamanoAlas + " cm";
    }
}
