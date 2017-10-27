package Components;

import Classes.Client;
import Components.ClientComponent;
import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Controller {
    @FXML
    Pane topPane;
    @FXML
    VBox topBox;

    @FXML
    Pane bottomPane;
    @FXML
    VBox bottomBox;

    @FXML
    Pane leftPane;

    @FXML
    Pane rightPane;

    @FXML
    Pane centerPane;

    public VBox getTopBox() {
        return topBox;
    }

    public void setTopBox(VBox topBox) {
        this.topBox = topBox;
    }

    public void initialize(){
        topBox.setAlignment(Pos.CENTER);
        addLoginScreen();
    }

    public void createClient(){
        System.out.println("klient stworzony pomyslnie");
    }

    public void addClientComponent(){
        bottomBox.getChildren().add(new ClientComponent().getNode());
    }

    public void addAdminMainMenu(){
        Button addClient = new Button("Dodaj Klienta");
        Button editClient = new Button("Edytuj Klienta");
        Button deleteClient = new Button("Usun Klienta");
        HBox przyciski = new HBox();
        przyciski.getChildren().addAll(new Label("Admin"),addClient,editClient,deleteClient);
        topBox.getChildren().add(przyciski);

        Client client = new Client();
        addClient.setOnAction(e -> addClientComponent());
    }

    public void addUserMainMenu(){
        Button addClient = new Button("Dodaj Klienta");
        Button editClient = new Button("Edytuj Klienta");
        Button deleteClient = new Button("Usun Klienta");
        HBox przyciski = new HBox();
        przyciski.getChildren().addAll(new Label("User"), addClient,editClient,deleteClient);
        topBox.getChildren().add(przyciski);

        Client client = new Client();
        addClient.setOnAction(e -> addClientComponent());
    }

    public void login(String username,String password){
        if (username.equals("admin") && password.equals("qwrr")){
            System.out.println("logged in as admin");
            lbl_loginInfo.setText("Login Succesful");
            topBox.getChildren().clear();
            addAdminMainMenu();

        }
        else if (username.equals("user") && password.equals("qwrr")){
            System.out.println("logged in as user");
            lbl_loginInfo.setText("Login Succesful");
            topBox.getChildren().clear();
            addUserMainMenu();
        }
        else {
            System.out.println("wrong username and/or password");
            lbl_loginInfo.setText("wrong username and/or password");
        }
    }
}
