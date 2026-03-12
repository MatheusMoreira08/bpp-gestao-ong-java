import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadastroCliente {
    private final String ARQUIVO = "clientes.txt";

    public void salvar(String nome, String cpf, String email) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
            String registro = nome + ";" + cpf + ";" + email;
            escritor.write(registro);
            escritor.newLine();
            System.out.println("Sucesso: Dados de " + nome + " gravados com exito!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroCliente cadastro = new CadastroCliente();

        System.out.println("--- TESTE: CADASTRO DE CLIENTE ---");
        System.out.print("Digite o Nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Digite o E-mail: ");
        String email = sc.nextLine();

        System.out.println("Tentando salvar no arquivo...");
        cadastro.salvar(nome, cpf, email);

        sc.close();
    }
}