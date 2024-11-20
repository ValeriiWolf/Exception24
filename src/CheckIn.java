public interface CheckIn {
    void checkLogin(String login)throws WrongLoginException;
    void checkPassword(String password)throws WrongPasswordException;
    void checkPasswords(String password,String confirmpassword)throws WrongPasswordException;
}
