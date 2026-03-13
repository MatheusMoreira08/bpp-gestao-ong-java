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

    private boolean isCpfValido(String cpf) {
        String numeros = cpf.replaceAll("\\D", "");
        if (numeros.length() != 11 || numeros.matches("(\\d)\\1{10}")) return false;

        try {
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += (numeros.charAt(i) - '0') * (10 - i);
            }
            int d1 = 11 - (soma % 11);
            if (d1 > 9) d1 = 0;

            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += (numeros.charAt(i) - '0') * (11 - i);
            }
            int d2 = 11 - (soma % 11);
            if (d2 > 9) d2 = 0;

            return (d1 == (numeros.charAt(9) - '0') && d2 == (numeros.charAt(10) - '0'));
        } catch (Exception e) {
            return false;
        }
    }

    private boolean isEmailValido(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroCliente cadastro = new CadastroCliente();

        System.out.println("--- TESTE: CADASTRO DE CLIENTE ---");

        String nome = "";
        while (nome.trim().isEmpty()) {
            System.out.print("Digite o Nome: ");
            nome = sc.nextLine();
            if (nome.trim().isEmpty()) {
                System.out.println("ERRO: O nome nao pode ficar em branco. Tente novamente.");
            }
        }

        String cpf = "";
        while (true) {
            System.out.print("Digite o CPF: ");
            cpf = sc.nextLine();
            
            if (cadastro.isCpfValido(cpf)) {
                break; 
            } else {
                System.out.println("ERRO: CPF invalido. Tente novamente.");
            }
        }

        String email = "";
        while (true) {
            System.out.print("Digite o E-mail: ");
            email = sc.nextLine();
            
            if (cadastro.isEmailValido(email)) {
                break; 
            } else {
                System.out.println("ERRO: E-mail invalido. O formato deve conter '@' e '.'. Tente novamente.");
            }
        }

        System.out.println("Todos os dados estao corretos! Tentando salvar no arquivo...");
        cadastro.salvar(nome, cpf, email);

        sc.close();
    }
}