public class Veiculo {

    public boolean retornarVeiculo() {
        return VeiculoFacade.verificarImpedimentosRetorno(this);
    }
}
