public class ValidadorCPF {
    public boolean validar(String cpf) {
        // RF02: Ignorar caracteres não numéricos 
        String numeros = cpf.replaceAll("\\D", "");

        if (numeros.length() != 11 || numeros.matches("(\\d)\\1{10}")) return false;

        try {
            // Cálculo do 1º Dígito Verificador
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += (numeros.charAt(i) - '0') * (10 - i);
            }
            int digito1 = 11 - (soma % 11);
            if (digito1 > 9) digito1 = 0;

            // Cálculo do 2º Dígito Verificador
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += (numeros.charAt(i) - '0') * (11 - i);
            }
            int digito2 = 11 - (soma % 11);
            if (digito2 > 9) digito2 = 0;

            return (digito1 == (numeros.charAt(9) - '0') && digito2 == (numeros.charAt(10) - '0'));
        } catch (Exception e) {
            return false;
        }
    }
}
