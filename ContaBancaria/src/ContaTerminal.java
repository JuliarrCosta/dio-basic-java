import java.util.Scanner;

public class ContaTerminal{
    //TODO: ..... 
    public int numeroConta;
    public String agencia;
    public String nome;
    public double saldo;

    //Criei o método construtor para inicializar os atributos
    public ContaTerminal(){
        
        Scanner scanner = new Scanner(System.in);
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

     //Criei um método para exibir a mensagem 
     public void exibirMensagem(){
        System.out.println("Olá "+nome+ ", obrigada por criar uma conta conosco! Sua conta é "+numeroConta+ ", agencia " +agencia+ "o seu saldo de " +saldo+ " já está disponível para saque." ); 
     }
    
    }
