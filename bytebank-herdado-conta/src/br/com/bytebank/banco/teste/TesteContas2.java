package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas2 {

    public static void main(String[] args) throws SaldoInsuficienteException {
    
        ContaEspecial ce = new ContaEspecial(222,111);
        ce.getSaldo();
        
        
        //Full Qualified Name
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);


        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

    }
}
