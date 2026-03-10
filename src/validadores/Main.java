import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Artefatos RF02 e RF03
        ValidadorCPF vCpf = new ValidadorCPF();
        ValidadorCNPJ vCnpj = new ValidadorCNPJ();

        System.out.println("--- Teste de Validadores (Engenharia de Software) ---");

        // Teste RF02 - Validação de CPF
        System.out.print("Digite um CPF para validar (com ou sem pontos): ");
        String cpfInput = scanner.nextLine();
        if (vCpf.validar(cpfInput)) {
            System.out.println("CPF Válido!");
        } else {
            System.out.println("CPF Inválido!");
        }

        System.out.println("---------------------------------------------------");

        // Teste RF03 - Validação de CNPJ 
        System.out.print("Digite um CNPJ para validar: ");
        String cnpjInput = scanner.nextLine();
        if (vCnpj.validar(cnpjInput)) {
            System.out.println("CNPJ Válido!");
        } else {
            System.out.println("CNPJ Inválido!");
        }

        scanner.close();
    }
}
