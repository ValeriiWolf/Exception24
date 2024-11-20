public class AuthorizationService {
    private static final CheckIn Check = new CikleCheckIn();
    private AuthorizationService(){}
    public static void check(String login, String password, String confirmPasword)
            throws WrongLoginException, WrongPasswordException {
        Check.checkLogin(login);
        Check.checkPassword(password);
        Check.checkPasswords(password,confirmPasword);
    }
}
