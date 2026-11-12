package parquecriaturas;

public class Unicornio extends Criatura {

    private String poderMagico;
    private int numeroCuernos;

    public Unicornio(String nombre, int edad, int energia,
                     String poderMagico, int numeroCuernos) {

        super(nombre, edad, energia);
        this.poderMagico = poderMagico;
        this.numeroCuernos = numeroCuernos;
    }

    public void usarMagia() {
        if (getNivelEnergia() >= 15) {
            consumirEnergia(15);
            System.out.println(getNombre() +
                " utiliza su magia: " + poderMagico);
        } else {
            System.out.println(getNombre() +
                " no tiene energia suficiente para usar magia.");
        }
    }

    @Override
    public void realizarActividadPrincipal() {
        usarMagia();
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
               " | Poder magico: " + poderMagico +
               " | Numero de cuernos: " + numeroCuernos;
    }
}
