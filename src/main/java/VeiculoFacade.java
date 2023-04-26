
public class VeiculoFacade {

    public static boolean verificarImpedimentosRetorno(Veiculo veiculo) {
        if(Documentos.getInstance().verificarVeiculoImpedido(veiculo)){
            return false;
        }
        if(EstadoLataria.getInstance().verificarVeiculoImpedido(veiculo)){
            return false;
        }
        if(NivelGasolina.getInstance().verificarVeiculoImpedido(veiculo)){
            return false;
        }
        return true;
    }
}
