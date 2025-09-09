import java.util.Scanner;
//aprendendo git

public class ColetorDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //criando scanner

        System.out.println("Entre com seu nome: "); //coleta o nome
        String nome = scanner.nextLine();

        System.out.println("Entre com a sua idade: "); //coleta a idade
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Entre com seu CPF: "); //coleta o CPF
        String cpf = scanner.nextLine();

        scanner.close(); //fecha o scanner

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf );
    }
}