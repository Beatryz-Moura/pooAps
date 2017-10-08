package contabancaria;

public class ContaCorrente extends Conta{
    
    @Override
    public float atualizaConta(){
        float saldoAtualizado = (float)(this.saldo = saldo + (saldo * (2*(taxa/100))));
        return saldoAtualizado;
    }
    @Override
    public void depositar(float deposito){
        //deposito menos 10 centavos
        this.saldo = (float) (saldo + (deposito-0.1));
    }
    public String getInfo(){
        String informacao = "\nConta do tipo: " + getClass() + "\nSaldo inicial de: R$200,00"  
        + "\nCom taxa percentual fornecida de: " + getTaxa() + "%"
        + "\nO valor do saldo após a taxa, depósitos e saques é de: R$" + getSaldo();  
        return informacao;
    }
}
