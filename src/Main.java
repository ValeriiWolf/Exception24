import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите логин");
        String login = scanner.nextLine();
        System.out.println("введите пароль");
        String password = scanner.nextLine();
        System.out.println("введите повторный пароль");
        String confirmPassword = scanner.nextLine();
        try {
            AuthorizationService.check(login,password,confirmPassword);
        }catch (WrongLoginException|WrongPasswordException e){
            System.out.println(e.getMessage());
        }


    }
}