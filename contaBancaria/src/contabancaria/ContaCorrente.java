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
    @Override
    public String getInfo(){
        String informacaoBasica = super.getInfo();  
        String informacao = "\nTipo de Conta: Conta Corrente\n\nA cada depósito, são removidos 10 centavos de taxa."
            + "\nA atualização da conta é feita com o dobro da taxa.\n" + informacaoBasica;
        return informacao;
    }
}
