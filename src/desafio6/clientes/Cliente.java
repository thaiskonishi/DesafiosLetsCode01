package desafio6.clientes;

import java.util.ArrayList;
import java.util.List;

import desafio6.investimentos.Investimento;
;
public abstract class Cliente {
    private String nomeCliente;
    private int codigoCliente;
    private List<Investimento> carteiraInvestimentos = new ArrayList<>();

    public List<Investimento> getCarteiraInvestimentos() {
        return this.carteiraInvestimentos;
    }

    public void setCarteiraInvestimentos(Investimento investimento) {
        this.carteiraInvestimentos.add(investimento);
    }

    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

}
