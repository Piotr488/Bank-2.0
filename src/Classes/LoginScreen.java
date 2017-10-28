package Classes;

import java.util.HashMap;
import java.util.Map;

public class LoginScreen {
    private String username;
    private boolean userLoggedIn = false;
    private boolean userExists = false;
    private boolean superUser = false;
    private Map<String,String> bazaHasel;

    public LoginScreen() {
        bazaHasel = new HashMap<>();
        bazaHasel.put("admin", "qwrr");
        bazaHasel.put("student", "qwrr");
    }

    /**
     * Funkcja odpowiedzialna za logowanie do aplikacji. W wersji pełnej powinna
     * zczytywać hasła z bazy danych.
     *
     * @return true jeżeli istnieje user o nazwie username i jego hasło zagadza się z podanym
     */
    public boolean login(String username, String password) {
            if (bazaHasel.containsKey(username) && bazaHasel.get(username).equals(password)) {
                this.username = username;
                System.out.println("pomyslnie zalogowany");
                userLoggedIn = true;
                return true;
            } else {
                this.username = "";
                System.out.println("Brak dostepu");
                userLoggedIn = false;
                return false;
            }

    }
//    private boolean userVerification(String username, String password){
//        do {
//            if (isUserReal(username, password)) {
//                System.out.println("uzytkownik istnieje");
//                if (isSuperUser(username)) {
//                    System.out.println("uzytkownik jest Super Userem");
//                    return true;
//                } else {
//                    System.out.println("to jest zwykly uzytkownik");
//                    return false;
//                }
//            } else {
//                System.out.println("brak uzytkownika");
//                return false;
//            }
//        } while (isSuperUser(username) || !isSuperUser(username));
//    }
//
//    private boolean isUserReal(String username, String password){
//        System.out.println("Próba zalogowania usera [" + username + "] z hasłem [" + password + "]");
//        if (bazaHasel.containsKey(username) && bazaHasel.get(username).equals(password)) {
//            this.username = username;
//            System.out.println("pomyslnie zalogowany");
//            return true;
//        } else {
//            this.username = "";
//            System.out.println("Brak dostepu");
//            return false;
//        }
//    }
//    private boolean isSuperUser(String username){
//        if (username == "admin"){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
}
