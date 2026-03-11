import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CadastroCliente {
    private final String ARQUIVO = "clientes.txt";

    public void salvar(String nome, String cpf, String email) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
            String registro = nome + ";" + cpf + ";" + email;
            escritor.write(registro);
            escritor.newLine(); 
            System.out.println("Sucesso: Dados de " + nome + " gravados com êxito!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        }
    }
}