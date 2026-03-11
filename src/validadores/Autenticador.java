import java.util.Scanner;

public class Autenticador {

    private static final String LOGIN = "admin";
    private static final String SENHA = "Senha@123";

    public static boolean autenticar(String login, String senha) {

        if(!senhaTemEspecial(senha)) {
            return false;
        }

        return login.equals(LOGIN) && senha.equals(SENHA);
    }

    private static boolean senhaTemEspecial(String senha) {

        String especiais = "!@#$%&*()_+-=[]|,./?><";

        for(int i = 0; i < senha.length(); i++) {

            if(especiais.indexOf(senha.charAt(i)) != -1) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Login: ");
        String login = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        if(autenticar(login, senha)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado Usuário ou Senha Incorretos !");
        }

        sc.close();
    }
}