import java.util.Scanner;

public class ValidadorCPF {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ValidadorCPF validador = new ValidadorCPF();

        System.out.print("Digite o CPF para validar: ");
        String cpf = leitor.nextLine();

        if (validador.validar(cpf)) {
            System.out.println("Resultado: CPF VÁLIDO");
        } else {
            System.out.println("Resultado: CPF INVÁLIDO");
        }
        leitor.close();
    }

    public boolean validar(String cpf) {
        String numeros = cpf.replaceAll("\\D", "");
        
        if (numeros.length() != 11 || numeros.matches("(\\d)\\1{10}")) return false;

        try {
            // 1º Dígito
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += (numeros.charAt(i) - '0') * (10 - i);
            }
            int d1 = 11 - (soma % 11);
            if (d1 > 9) d1 = 0;

            // 2º Dígito
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
}
