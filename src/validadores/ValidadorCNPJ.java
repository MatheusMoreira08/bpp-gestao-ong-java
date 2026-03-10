public class ValidadorCNPJ {
    public boolean validar(String cnpj) {
        String numeros = cnpj.replaceAll("\\D", ""); // Requisito de limpeza 

        if (numeros.length() != 14 || numeros.matches("(\\d)\\1{13}")) return false;

        int[] peso1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] peso2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

        int digito1 = calcularDigito(numeros.substring(0, 12), peso1);
        int digito2 = calcularDigito(numeros.substring(0, 12) + digito1, peso2);

        return numeros.equals(numeros.substring(0, 12) + digito1 + digito2);
    }

    private int calcularDigito(String str, int[] peso) {
        int soma = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            soma += (str.charAt(i) - '0') * peso[peso.length - str.length() + i];
        }
        soma = 11 - (soma % 11);
        return (soma > 9) ? 0 : soma;
    }
}
