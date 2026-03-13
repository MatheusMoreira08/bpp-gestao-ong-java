import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RelatorioClientes {
    private final String ARQUIVO = "clientes.txt";

    public void listarClientes() {
        File arquivo = new File(ARQUIVO);
        
        if (!arquivo.exists()) {
            System.out.println("Nenhum cliente cadastrado ainda. O arquivo não foi encontrado.");
            return;
        }

        System.out.println("=========================================");
        System.out.println("          RELATÓRIO DE CLIENTES          ");
        System.out.println("=========================================");

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            int total = 0;
            
            while ((linha = leitor.readLine()) != null) {
                // Divide a linha usando o ponto e vírgula
                String[] dados = linha.split(";");
                
                if (dados.length >= 3) {
                    System.out.println("Nome:  " + dados[0].trim());
                    System.out.println("CPF:   " + dados[1].trim());
                    System.out.println("Email: " + dados[2].trim());
                    System.out.println("-----------------------------------------");
                    total++;
                }
            }
            System.out.println("Total de clientes listados: " + total);
            System.out.println("=========================================");
            
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        RelatorioClientes relatorio = new RelatorioClientes();
        relatorio.listarClientes();
    }
}