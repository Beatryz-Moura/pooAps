package contabancaria;

import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        
        Scanner entrada1=new Scanner(System.in);
        FormularioTeste FormTeste=new FormularioTeste();
        System.out.println("--------- Conta 1 ---------");
	System.out.printf("Forneça a taxa percentual da Conta: ");
        float taxa1 = entrada1.nextFloat();               
        ContaCorrente conta1 = new ContaCorrente();
        conta1.setTaxa(taxa1);
        conta1.depositar(500);
        System.out.println("Saldo após valor depositado: R$" + conta1.getSaldo());
        conta1.sacar(130);
        System.out.println("Saldo após valor sacado: R$" + conta1.getSaldo());
        conta1.atualizaConta();
        System.out.println("Atualizando a conta, o saldo com taxa é: R$" + conta1.getSaldo());
        FormTeste.adiciona(conta1);
        
        Scanner entrada2=new Scanner(System.in);
        System.out.println("\n--------- Conta 2 ---------");
	System.out.printf("Forneça a taxa percentual da Conta: ");
        float taxa2 = entrada2.nextFloat();
        ContaPoupanca conta2 = new ContaPoupanca();
        conta2.setTaxa(taxa2);   
        conta2.depositar(200);
        System.out.println("Saldo após depositado: R$" + conta2.getSaldo());
        conta2.sacar(20);
        System.out.println("Saldo após saque: R$" + conta2.getSaldo());
        conta2.atualizaConta();
        System.out.println("Atualizando a conta, o saldo com taxa é: R$" + conta2.getSaldo());        
        FormTeste.adiciona(conta2);
    }
    
}
