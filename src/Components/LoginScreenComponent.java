package Components;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class LoginScreenComponent {
    Label lbl_loginInfo = new Label();
    VBox vbox = new VBox();
    TextField tf_username = new TextField();
    PasswordField pf_password = new PasswordField();
    Button btn_login = new Button("Login");
    Separator space1 = new Separator();
    Separator space2 = new Separator();

    public Label getLbl_loginInfo() {
        return lbl_loginInfo;
    }

    public void setLbl_loginInfo(Label lbl_loginInfo) {
        this.lbl_loginInfo = lbl_loginInfo;
    }

    public void initialize(){
        space1.setOrientation(Orientation.VERTICAL);
        space1.prefHeight(40);
        space1.setVisible(false);

        space2.setOrientation(Orientation.VERTICAL);
        space2.prefHeight(40);
        space2.setVisible(false);

        tf_username.setPromptText("Username");
        pf_password.setPromptText("Password");

        btn_login.setMaxWidth(Double.MAX_VALUE);

        vbox.setAlignment(Pos.CENTER);


        vbox.getChildren().addAll(new Label("Login Screen"),space1,lbl_loginInfo,space2,tf_username,pf_password,btn_login);
        getTopBox().getChildren().add(vbox);

        btn_login.setOnAction(e -> login(tf_username.getText(),pf_password.getText()));
    }
}