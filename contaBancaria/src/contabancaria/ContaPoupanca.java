package contabancaria;

public class ContaPoupanca extends Conta{
    
    @Override
    public float atualizaConta(){
        return this.saldo = saldo + (saldo * (3*(taxa/100)));
    }
    public String getInfo(){
        String informacao = "\nConta do tipo: " + getClass() + "\nSaldo inicial de: R$200,00"  
        + "\nCom taxa percentual fornecida de: " + getTaxa() + "%"
        + "\nO valor do saldo após a taxa, depósitos e saques é de: R$" + getSaldo();  
        return informacao;
    }
}
