import java.util.ArrayList;
import java.util.List;

public abstract class Locadora {

    private List<Veiculo> veiculosImpedidos = new ArrayList<Veiculo>();

    public void addVeiculoImpedido(Veiculo veiculo){
        this.veiculosImpedidos.add(veiculo);
    }

    public boolean verificarVeiculoImpedido(Veiculo veiculo) {
        return this.veiculosImpedidos.contains(veiculo);
    }
}
