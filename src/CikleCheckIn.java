public class CikleCheckIn implements CheckIn{
    private static final String Alfavir="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
    @Override
    public void checkLogin(String login) throws WrongLoginException {
        if(login.isEmpty() || login.length()>20){
                throw new WrongLoginException("Длина логина должна быть больше 0 и меньше или равна 20 символам");
        }
        for (int i=0;i<login.length();i++){
            if(!Alfavir.contains(String.valueOf(login.charAt(i)))){
                throw new WrongLoginException("некорректный символ логина "+login.charAt(i));
            }
        }
    }

    @Override
    public void checkPassword(String password) throws WrongPasswordException {
        if(password.isEmpty() || password.length()>20){
            throw new WrongPasswordException("Длина пароля должна быть больше 0 и меньше или равна 20 символам");
        }
        for (int i=0;i<password.length();i++){
            if(!Alfavir.contains(String.valueOf(password.charAt(i)))){
                throw new WrongPasswordException("некорректный символ пароля "+password.charAt(i));
            }
        }
    }

    @Override
    public void checkPasswords(String password, String confirmpassword) throws WrongPasswordException {
        if (!password.equals(confirmpassword)){
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
