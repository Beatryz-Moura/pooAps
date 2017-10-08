package contabancaria;

public class ContaPoupanca extends Conta{
        
    @Override
    public float atualizaConta(){
        return this.saldo = saldo + (saldo * (3*(taxa/100)));
    }
   @Override
    public String getInfo(){
        String informacaoBasica = super.getInfo();  
        String informacao = "\nTipo de Conta: Conta Poupança\n\nA atualização da conta é feita com o triplo da taxa.\n" + informacaoBasica;
        return informacao;
    }
}
