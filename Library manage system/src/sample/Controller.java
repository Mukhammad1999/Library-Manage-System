package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class Controller  {
@FXML
    public void TitleSignUp(ActionEvent event){
    try {
        Parent root = FXMLLoader.load(getClass().getResource("SignUpPage.fxml"));
        Stage stage1 = new Stage();
        stage1.setTitle("SignUpPage");
        stage1.setScene(new Scene(root, 1200, 800));
        stage1.show();

    }
    catch (Exception e){

    }


    }


}
