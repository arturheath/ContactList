package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.Optional;

public class Controller {

    @FXML
    private GridPane mainGridPane;

    @FXML
    public void showDialog(){

        Dialog<ButtonType> dialog = new Dialog<ButtonType>();
        dialog.initOwner(mainGridPane.getScene().getWindow());

        try {
            Parent root = FXMLLoader.load(getClass().getResource("dialogwindow.fxml"));
            dialog.getDialogPane().setContent(root);

        } catch(IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if(result.isPresent() && result.get() == ButtonType.OK){
            System.out.println("OK pressed");
        } else System.out.println("Cancel pressed");
    }


}
