package contabancaria;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("0.00");    
        Scanner entrada1=new Scanner(System.in);
        Scanner entrada2=new Scanner(System.in);
        FormularioTeste FormTeste=new FormularioTeste();
        float taxa1, taxa2;
        
        ContaCorrente conta1 = new ContaCorrente();
        System.out.println("--------- Conta 1 ---------");
        do{
	System.out.printf("\nForneça a taxa percentual da Conta (y,y): ");
        taxa1 = entrada1.nextFloat();
        conta1.setTaxa(taxa1);
        if(!conta1.setTaxa(taxa1)){
            System.out.println("Taxa Inválida! Digite nova taxa.");
        }
        }while(!conta1.setTaxa(taxa1));
        conta1.depositar(500);
        System.out.println("Saldo após depósito: R$" + conta1.getSaldo());
        conta1.sacar(130);
        System.out.println("Saldo após saque: R$" + conta1.getSaldo());
        conta1.atualizaConta();
        System.out.println("Atualizando a conta, o saldo com taxa é: R$" +  dc.format(conta1.getSaldo()));
        FormTeste.adiciona(conta1);
        
        ContaPoupanca conta2 = new ContaPoupanca();
        System.out.println("--------- Conta 2 ---------");
        do{
	System.out.printf("\nForneça a taxa percentual da Conta (y,y): ");
        taxa2 = entrada2.nextFloat();
        conta2.setTaxa(taxa2);   
        if(!conta2.setTaxa(taxa2)){
            System.out.println("Taxa Inválida! Digite nova taxa.");
        }
        }while(!conta2.setTaxa(taxa2));
        conta2.depositar(200);
        System.out.println("Saldo após depósito: R$" + conta2.getSaldo());
        conta2.sacar(20);
        System.out.println("Saldo após saque: R$" + conta2.getSaldo());
        conta2.atualizaConta();
        System.out.println("Atualizando a conta, o saldo com taxa é: R$" + dc.format(conta2.getSaldo()));        
        FormTeste.adiciona(conta2);
    }
    
}
