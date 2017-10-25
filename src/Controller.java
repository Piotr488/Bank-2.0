import Classes.Client;
import Components.ClientComponent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Controller {
    @FXML
    Pane topPane;

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
        Button addClient = new Button("Dodaj Klienta");
        Button editClient = new Button("Edytuj Klienta");
        Button deleteClient = new Button("Usun Klienta");
        HBox przyciski = new HBox();
        przyciski.getChildren().addAll(addClient,editClient,deleteClient);
        topPane.getChildren().add(przyciski);

        Client client = new Client();
        addClient.setOnAction(e -> addClientComponent());
    }

    public void createClient(){
        System.out.println("klient stworzony pomyslnie");
    }

    public void addClientComponent(){
        bottomBox.getChildren().add(new ClientComponent().getNode());
    }
}
