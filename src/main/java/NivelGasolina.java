public class NivelGasolina extends Locadora{
    private static NivelGasolina nivelGasolina = new NivelGasolina();

    private NivelGasolina() {};

    public static NivelGasolina getInstance() {
        return nivelGasolina;
    }
}
