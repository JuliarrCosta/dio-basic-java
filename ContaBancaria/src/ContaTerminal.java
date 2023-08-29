
/**
* <h1>Conta Terminal </h1>
* A classe recebe como parâmetros do usuário dados necessários para criacão de uma conta bancária
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Julia Costa
* @version 3.0
* @since   25/08/2023
*/

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{

    private int numeroConta;
    private String agencia;
    private String nome;
    private double saldo;

    //Criei o método construtor para inicializar os atributos
    /**
     * 
     */
    public ContaTerminal(){
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("--------- Criar conta -------------");
        
        System.out.println("Digite o número da conta: ");
        this.numeroConta = scanner.nextInt();

        System.out.println("Digite a agencia: ");
        this.agencia = scanner.nextLine();
        scanner.nextLine(); //Limpando o buffer do teclado

        System.out.println("Digite seu nome: ");
        this.nome = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        this.saldo = scanner.nextDouble();
    
    }

      /**
    * Este método é utilizado para mostrar a criacão da conta
    * @return retorno vazio
    */
     public void exibirMensagem(){
        System.out.println("Olá "+nome+ ", obrigada por criar uma conta conosco! Sua conta é "+numeroConta+ ", agencia " +agencia+ "o seu saldo de " +saldo+ " já está disponível para saque." ); 
     }
    
    }
