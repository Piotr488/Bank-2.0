

import Classes.Client;
import Classes.LoginScreen;
import Components.ClientComponent;
import Components.LoginDialogComponent;
import Components.LoginScreenComponent;
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

    boolean loggedIn = false;
    private LoginScreen loginScreen = new LoginScreen();

    public void initialize(){
        topBox.setAlignment(Pos.CENTER);
        addLoginScreenComponent();

    }

    public void addLoginDialogComponent() {
        new LoginDialogComponent().showAndWait((username, password) -> {
            loginScreen.login(username,password);
            return loginScreen.login(username, password);
        });
    }
    public void addLoginScreenComponent(){
        topBox.getChildren().add(new LoginScreenComponent().getNode());
    }



    public void addClientComponent(){
        bottomBox.getChildren().add(new ClientComponent().getNode());
    }


}
