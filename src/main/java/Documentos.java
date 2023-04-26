public class Documentos extends Locadora{
    private static Documentos documentos = new Documentos();

    private Documentos() {};

    public static Documentos getInstance() {
        return documentos;
    }
}
