package Classes;


import Components.LoginScreenComponent;

public class LoginScreen {
    LoginScreenComponent loginScreenComponent = new LoginScreenComponent();
    Controller

    public void login(String username,String password){
        if (username.equals("admin") && password.equals("qwrr")){
            System.out.println("logged in as admin");
            loginScreenComponent.getLbl_loginInfo().setText("Login Succesful");
            topBox.getChildren().clear();
            addAdminMainMenu();

        }
        else if (username.equals("user") && password.equals("qwrr")){
            System.out.println("logged in as user");
            loginScreenComponent.getLbl_loginInfo().setText("Login Succesful");
            topBox.getChildren().clear();
            addUserMainMenu();
        }
        else {
            System.out.println("wrong username and/or password");
            lbl_loginInfo.setText("wrong username and/or password");
        }
    }
}
