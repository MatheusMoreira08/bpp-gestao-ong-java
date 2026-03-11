import java.util.Scanner;

public class ValidadorEmail {

    public static boolean validarFormato(String email) {

        if(email.contains("@") && email.contains(".")) {
            return true;
        }

        return false;
    }

    public static boolean confirmarEmail(String email1, String email2) {

        if(email1.equals(email2)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o email: ");
        String email1 = sc.nextLine();

        System.out.print("Confirme o email: ");
        String email2 = sc.nextLine();

        if(validarFormato(email1) && confirmarEmail(email1, email2)) {
            System.out.println("Email valido");
        } else {
            System.out.println("Email invalido");
        }

        sc.close();
    }
}