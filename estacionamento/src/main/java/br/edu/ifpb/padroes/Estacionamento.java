package br.edu.ifpb.padroes;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
//import java.time.Duration;
import java.time.LocalDateTime;

@Getter
@Setter
public class Estacionamento {

    private LocalDateTime entrada;
    private LocalDateTime saida;
    private Veiculo veiculo;
    private Cobranca cobranca = new Cobranca();

    public BigDecimal obterCobranca() {
        assert(veiculo != null);
        BigDecimal valor = new BigDecimal(0);
        cobranca.setEntrada(entrada);
        cobranca.setSaida(saida);
        valor = cobranca.obterTotalAPagar();
        return valor;
    }

}
