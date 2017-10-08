package contabancaria;

public abstract class Conta{
    
    protected float saldo = 200;
    protected float taxa;
   
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void depositar(float deposito){
        this.saldo += deposito;
    }
    public void sacar(float saque){
        this.saldo -= saque;
    }
    public void setTaxa(float taxa){
        this.taxa = taxa;
    }
    public float getTaxa(){
        return taxa;
    }
    public float atualizaConta(){
        return this.saldo = saldo + (saldo * (taxa/100));
    }
}