package desafio6.clientes;

import desafio6.investimentos.Acao;
import desafio6.investimentos.FundoImobiliario;

public class ClienteArrojado extends Cliente {

    public void contratarInvestimento(Acao investimento) {
        super.setCarteiraInvestimentos(investimento);
    }

    public void contratarInvestimento(FundoImobiliario investimento) {
        super.setCarteiraInvestimentos(investimento);
    }
}
