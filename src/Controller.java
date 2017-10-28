

import Classes.Client;
import Components.ClientComponent;
import Components.LoginDialogComponent;
import javafx.fxml.FXML;
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

    public void initialize(){
        topBox.setAlignment(Pos.CENTER);

    }

    public void addLoginDialog() {
        new LoginDialogComponent().showAndWait((username, password) -> {
            //Kod który zostanie wykonany po naciśnięciu "Login"
            return doLogin(username, password);
        });
    }

    private boolean doLogin(String username, String password) {
        if (applicationService.login(username, password)) {
            userLabel.setText("Zalogowany jako [" + username + "]");
            loggedIn = true;
            return true;
        }
        loggedIn = false;
        userLabel.setText("(niezalogowany)");
        return false;
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
}
