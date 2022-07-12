package desafio6.clientes;

import desafio6.investimentos.*;

public class ClienteModerado extends Cliente {

    public void contratarInvestimento(Acao investimento) {
        super.setCarteiraInvestimentos(investimento);
    }

    public void contratarInvestimento(FundoImobiliario investimento) {
        this.setCarteiraInvestimentos(investimento);
    }

    public void contratarInvestimento(CDB investimento) {
        super.setCarteiraInvestimentos(investimento);
    }

    public void contratarInvestimento(Tesouro investimento) {
        super.setCarteiraInvestimentos(investimento);

    }
}
