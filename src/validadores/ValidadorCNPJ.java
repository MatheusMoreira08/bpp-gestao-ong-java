
import java.util.Scanner;

public class ValidadorCNPJ {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ValidadorCNPJ validador = new ValidadorCNPJ();

        System.out.print("Digite o CNPJ para validar: ");
        String cnpj = leitor.nextLine();

        if (validador.validar(cnpj)) {
            System.out.println("Resultado: CNPJ VÁLIDO");
        } else {
            System.out.println("Resultado: CNPJ INVÁLIDO");
        }
        leitor.close();
    }

    public boolean validar(String cnpj) {
        String numeros = cnpj.replaceAll("\\D", "");

        if (numeros.length() != 14 || numeros.matches("(\\d)\\1{13}")) return false;

        try {
            int[] pesos1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
            int[] pesos2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

            // 1º Dígito
            int soma = 0;
            for (int i = 0; i < 12; i++) {
                soma += (numeros.charAt(i) - '0') * pesos1[i];
            }
            int d1 = 11 - (soma % 11);
            if (d1 > 9) d1 = 0;

            // 2º Dígito
            soma = 0;
            for (int i = 0; i < 13; i++) {
                soma += (numeros.charAt(i) - '0') * pesos2[i];
            }
            int d2 = 11 - (soma % 11);
            if (d2 > 9) d2 = 0;

            return (d1 == (numeros.charAt(12) - '0') && d2 == (numeros.charAt(13) - '0'));
        } catch (Exception e) {
            return false;
        }
    }
}
