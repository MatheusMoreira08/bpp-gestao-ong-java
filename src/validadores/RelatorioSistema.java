import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RelatorioSistema {

    private final String ARQUIVO = "estados.csv";

    public void lerEstados() {

        File arquivo = new File(ARQUIVO);

        if (!arquivo.exists()) {
            System.out.println("Arquivo estados.csv não encontrado.");
            return;
        }

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {

            String linha;

            System.out.println("===== RELATÓRIO DE ESTADOS =====");

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(";");

                for (int i = 0; i < dados.length; i++) {
                    System.out.print(dados[i]);

                    if (i < dados.length - 1) {
                        System.out.print(" | ");
                    }
                }

                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        RelatorioSistema relatorio = new RelatorioSistema();

        relatorio.lerEstados();
    }
}