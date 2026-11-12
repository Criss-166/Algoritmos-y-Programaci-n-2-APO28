package parquecriaturas;

public class Dragon extends Criatura {

    private int temperaturaFuego;
    private boolean puedeVolar;

    public Dragon(String nombre, int edad, int energia,
                  int temperaturaFuego, boolean puedeVolar) {

        super(nombre, edad, energia);
        this.temperaturaFuego = temperaturaFuego;
        this.puedeVolar = puedeVolar;
    }

    public void lanzarFuego() {
        if (getNivelEnergia() >= 20) {
            consumirEnergia(20);
            System.out.println(getNombre() +
                " lanza fuego a " + temperaturaFuego + " grados.");
        } else {
            System.out.println(getNombre() +
                " no tiene energia suficiente para lanzar fuego.");
        }
    }

    @Override
    public void realizarActividadPrincipal() {
        lanzarFuego();
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
               " | Temperatura de fuego: " + temperaturaFuego +
               " | Puede volar: " + puedeVolar;
    }
}
