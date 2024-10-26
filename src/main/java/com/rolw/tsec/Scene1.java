package com.rolw.tsec;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scene1 {
    @FXML
    private AnchorPane scenePane;
    @FXML
    private Button buttonLogout;

    public void logout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setContentText("Do you want to save before exit?");
        if(alert.showAndWait().get() == ButtonType.OK){
        Stage stage = (Stage) scenePane.getScene().getWindow();
        System.out.println("Logout Successfully!");
        stage.close();}
    }

    public Button getButtonLogout() {
        return buttonLogout;
    }

    public void setButtonLogout(Button buttonLogout) {
        this.buttonLogout = buttonLogout;
    }
}
