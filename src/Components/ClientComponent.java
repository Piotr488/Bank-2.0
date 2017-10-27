package Components;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ClientComponent {
    Label lbl_imieKlienta = new Label("Imie klienta: ");
    Label lbl_nazwiskoKlienta = new Label("Nazwisko klienta: ");
    Label lbl_dataUrodzeniaKlienta = new Label("Data urodzenia klienta: ");
    Label lbl_peselKlienta = new Label("Pesel klienta: ");

    TextField tf_imieKlienta = new TextField();
    TextField tf_nazwiskoKlienta = new TextField();
    TextField tf_dataUrodzeniaKlienta = new TextField();
    TextField tf_peselKlienta = new TextField();

    VBox vBox_1 = new VBox();
    VBox vBox_2 = new VBox();
    VBox vBox_3 = new VBox();
    VBox vBox_4 = new VBox();

    HBox hBox = new HBox();


    public ClientComponent() {
        initialize();
    }

    public void addLabels(VBox vbox, Label lbl1, Label lbl2){
        vbox.getChildren().addAll(lbl1,lbl2);
    }
    public void addTextFields(VBox vbox, TextField tf1, TextField tf2){
        vbox.getChildren().addAll(tf1,tf2);
    }

    public void stylizeVBox(VBox vbox){
        vbox.setAlignment(Pos.BOTTOM_LEFT);
        vbox.setStyle("-fx-padding: 5px;");
    }

    public void initialize(){
        stylizeVBox(vBox_1);
        stylizeVBox(vBox_2);
        stylizeVBox(vBox_3);
        stylizeVBox(vBox_4);

        addLabels(vBox_1,lbl_imieKlienta,lbl_dataUrodzeniaKlienta);
        addTextFields(vBox_2,tf_imieKlienta,tf_dataUrodzeniaKlienta);
        addLabels(vBox_3,lbl_nazwiskoKlienta,lbl_peselKlienta);
        addTextFields(vBox_4,tf_nazwiskoKlienta,tf_peselKlienta);

        hBox.getChildren().addAll(vBox_1,vBox_2,vBox_3,vBox_4);
        hBox.setStyle("-fx-solid: 3px; -fx-border-color: black;");
    }

    public Node getNode(){
        return hBox;
    }
}
