import java.util.Scanner;

public class ContaTerminal{
    //TODO: Criei os atributos encapsulados 
    private int numeroConta;
    private String agencia;
    private String nome;
    private double saldo;

    //Criei o método construtor para inicializar os atributos
    public ContaTerminal(int numeroConta, String agencia, String nome, double saldo){
        
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    //Criei um método para interagir com o usuário e no final instanciar uma conta
    public static ContaTerminal criarConta(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------- Criar conta -------------");
        
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite a agencia: ");
        String agencia = scanner.nextLine();
        scanner.nextLine(); //Limpando o buffer do teclado

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        return new ContaTerminal(numeroConta, agencia, nome, saldo);
     }

     //Criei um método para exibir a mensagem 
     public void exibirMensagem(){
        System.out.println("Olá "+nome+ ", obrigada por criar uma conta conosco! Sua conta é "+numeroConta+ ", agencia " +agencia+ "o seu saldo de " +saldo+ " já está disponível para saque." ); 
     }

     public static void main(String[] args) {
        ContaTerminal c1 = criarConta();
        c1.exibirMensagem();
    }


    
}
