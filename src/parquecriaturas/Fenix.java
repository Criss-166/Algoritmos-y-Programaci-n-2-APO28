package parquecriaturas;

public class Fenix extends Criatura {

    private boolean puedeResurgir;
    private String colorPlumas;

    public Fenix(String nombre, int edad, int energia,
                 boolean puedeResurgir, String colorPlumas) {

        super(nombre, edad, energia);
        this.puedeResurgir = puedeResurgir;
        this.colorPlumas = colorPlumas;
    }

    public void volar() {
        if (getNivelEnergia() >= 18) {
            consumirEnergia(18);
            System.out.println(getNombre() + " esta volando.");
        } else {
            System.out.println(getNombre() +
                " no tiene energia suficiente para volar.");
        }

        if (getNivelEnergia() == 0 && puedeResurgir) {
            resurgir();
        }
    }

    public void resurgir() {
        aumentarEnergia(50);
        System.out.println(getNombre() +
            " ha resurgido de las cenizas con 50 de energia.");
    }

    @Override
    public void realizarActividadPrincipal() {
        volar();
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
               " | Puede resurgir: " + puedeResurgir +
               " | Color de plumas: " + colorPlumas;
    }
}