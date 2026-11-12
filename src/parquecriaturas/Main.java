package parquecriaturas;

public class Main {

    public static void main(String[] args) {

        Parque parque = new Parque();

        // Crear criaturas

        Dragon dragon = new Dragon(
            "Furia", 120, 80, 1200, true);

        Unicornio unicornio = new Unicornio(
            "Luna", 50, 90, "Curacion", 1);

        Fenix fenix = new Fenix(
            "Ignis", 100, 20, true, "Rojo y dorado");

        Leprechaun leprechaun = new Leprechaun(
            "Patrick", 80, 70, 95);

        Pixie pixie = new Pixie(
            "Flora", 25, 85, 12.5);

        Trasgo trasgo = new Trasgo(
            "Gruñon", 60, 65, 90);

        // Agregar criaturas al parque

        parque.agregarCriatura(dragon);
        parque.agregarCriatura(unicornio);
        parque.agregarCriatura(fenix);
        parque.agregarCriatura(leprechaun);
        parque.agregarCriatura(pixie);
        parque.agregarCriatura(trasgo);

        // Listar todas las criaturas

        parque.listarCriaturas();

        // Realizar las actividades principales

        parque.realizarActividades();

        // Mostrar energia despues de las actividades

        parque.mostrarEstadoEnergia();

        // Alimentar y descansar

        System.out.println("\n===== RECUPERACION =====");

        dragon.alimentarse();
        unicornio.descansar();

        // Mostrar estado final

        parque.mostrarEstadoEnergia();
    }
}
