public class EstadoLataria extends Locadora{

    private static EstadoLataria estadoLataria = new EstadoLataria();

    private EstadoLataria() {};

    public static EstadoLataria getInstance() {
        return estadoLataria;
    }
}
