package parquecriaturas;

import java.util.ArrayList;

public class Parque {

    private ArrayList<Criatura> criaturas;

    public Parque() {
        criaturas = new ArrayList<Criatura>();
    }

    public void agregarCriatura(Criatura criatura) {
        criaturas.add(criatura);
        System.out.println(criatura.getNombre() +
            " ha sido agregada al parque.");
    }

    public void listarCriaturas() {
        System.out.println("\n===== CRIATURAS DEL PARQUE =====");

        for (Criatura criatura : criaturas) {
            System.out.println(criatura.mostrarInformacion());
        }
    }

    public void realizarActividades() {
        System.out.println("\n===== ACTIVIDADES =====");

        for (Criatura criatura : criaturas) {
            criatura.realizarActividadPrincipal();
        }
    }

    public void mostrarEstadoEnergia() {
        System.out.println("\n===== ESTADO DE ENERGIA =====");

        for (Criatura criatura : criaturas) {
            System.out.println(
                criatura.getNombre() +
                " | Energia: " +
                criatura.getNivelEnergia()
            );
        }
    }
}
