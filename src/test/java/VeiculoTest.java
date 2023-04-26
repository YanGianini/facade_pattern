import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeiculoTest {
    @Test
    void deveRetornarImpedimentoDocumentos() {
        Veiculo veiculo = new Veiculo();
        Documentos.getInstance().addVeiculoImpedido(veiculo);

        assertEquals(false, veiculo.retornarVeiculo());
    }

    @Test
    void deveRetornarImpedimentoEstadoLataria() {
        Veiculo veiculo = new Veiculo();
        EstadoLataria.getInstance().addVeiculoImpedido(veiculo);

        assertEquals(false, veiculo.retornarVeiculo());
    }

    @Test
    void deveRetornarImpedimentoNivelGasolina() {
        Veiculo veiculo = new Veiculo();
        NivelGasolina.getInstance().addVeiculoImpedido(veiculo);

        assertEquals(false, veiculo.retornarVeiculo());
    }

    @Test
    void deveRetornarSemImpedimento() {
        Veiculo veiculo = new Veiculo();

        assertEquals(true, veiculo.retornarVeiculo());
    }

}
