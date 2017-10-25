package Components;

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

    HBox hBox_imieKlienta = new HBox();
    HBox hBox_nazwiskoKlienta = new HBox();
    HBox hBox_dataUrodzeniaKlienta = new HBox();
    HBox hBox_peselKlienta = new HBox();

    VBox vBox_1 = new VBox();
    VBox vBox_2 = new VBox();

    HBox hBox = new HBox();


    public ClientComponent() {
        initialize();
    }

    public void addHorizontal(HBox hBox, Label lbl, TextField tf){
        hBox.getChildren().addAll(lbl,tf);
    }

    public void addVertical(VBox vbox, HBox hBox1, HBox hBox2){
        vbox.getChildren().addAll(hBox1,hBox2);
    }

    public void initialize(){
        addHorizontal(hBox_imieKlienta,lbl_imieKlienta,tf_imieKlienta);
        addHorizontal(hBox_nazwiskoKlienta,lbl_nazwiskoKlienta,tf_nazwiskoKlienta);
        addHorizontal(hBox_dataUrodzeniaKlienta,lbl_dataUrodzeniaKlienta,tf_dataUrodzeniaKlienta);
        addHorizontal(hBox_peselKlienta,lbl_peselKlienta,tf_peselKlienta);

        addVertical(vBox_1,hBox_imieKlienta,hBox_dataUrodzeniaKlienta);
        addVertical(vBox_2,hBox_nazwiskoKlienta,hBox_peselKlienta);

        hBox.getChildren().addAll(vBox_1,vBox_2);
    }

    public Node getNode(){
        return hBox;
    }
}
