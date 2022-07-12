package desafio6.clientes;

import desafio6.investimentos.CDB;
import desafio6.investimentos.Tesouro;

public class ClienteConservador extends Cliente {

    public void contratarInvestimento(CDB investimento) {
        super.setCarteiraInvestimentos(investimento);
    }

    public void contratarInvestimento(Tesouro investimento) {
        super.setCarteiraInvestimentos(investimento);

    }

}