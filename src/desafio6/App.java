package desafio6;

import desafio6.clientes.*;
import desafio6.investimentos.Acao;
import desafio6.investimentos.CDB;
import desafio6.investimentos.FundoImobiliario;
import desafio6.investimentos.Tesouro;

public class App {
    public static void main(String[] args) throws Exception {
        var conservador = new ClienteConservador();
        // metodo contratarInvestimento adiciona na lista de investimentos do cliente
        conservador.contratarInvestimento(new CDB());
        conservador.contratarInvestimento(new Tesouro());

        conservador.contratarInvestimento(new Acao());// ERRO compilação
        // for (Investimento i : conservador.getCarteiraInvestimentos()){
        // System.out.println(i);
        // }
        var arrojado = new ClienteArrojado();
        arrojado.contratarInvestimento(new Acao());
        arrojado.contratarInvestimento(new FundoImobiliario());

        arrojado.contratarInvestimento(new Tesouro());// ERRO compilação
        // for (Investimento i : arrojado.getCarteiraInvestimentos()){
        // System.out.println(i);
        // }
    }
}
