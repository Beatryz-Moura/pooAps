package contabancaria;

import java.text.DecimalFormat;

public abstract class Conta{
    DecimalFormat dc = new DecimalFormat("0.00");
    
    protected float saldo = 200;
    protected float saldoInicial = 200;
    protected float taxa;
   
    public float getSaldo() {
        return saldo;
    }
    public void depositar(float deposito){
        this.saldo += deposito;
    }
    public void sacar(float saque){
        this.saldo -= saque;
    }
    public boolean setTaxa(float taxa){
        if(taxa<=0){
            return false;
        }else{
            this.taxa = taxa;
            return true;
        }    
    }
    public float getTaxa(){
        return taxa;
    }
    public float atualizaConta(){
        return this.saldo = saldo + (saldo * (taxa/100));
    }
    public String getInfo(){
        String informacao = "\nSaldo inicial: R$" + saldoInicial    
        + "\nCom taxa percentual fornecida de: " + getTaxa() + "%"
        + "\nO valor do saldo atualizado, após depósitos e saques é de: R$" + dc.format(getSaldo()) + "\n";  
        return informacao;
    }
}