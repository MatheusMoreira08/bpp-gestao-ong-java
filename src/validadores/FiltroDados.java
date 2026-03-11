import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FiltroDados {
    private final String ARQUIVO = "clientes.txt";

    public boolean verificarDuplicidade(String cpf) {
        File arquivo = new File(ARQUIVO);
        
        if (!arquivo.exists()) {
            return false;
        }

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length >= 2) {
                    String cpfRegistrado = dados[1].trim();
                    if (cpfRegistrado.equals(cpf.trim())) {
                        return true; 
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro na leitura: " + e.getMessage());
        }
        
        return false; 
    }
}