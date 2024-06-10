package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button CancelButton;

    public HelloController(Button cancelButton) {
        CancelButton = cancelButton;
    }

    public void CancelButtonAction(ActionEvent event){
        Stage stage = (stage) CancelButton.getScene().getWindow();
        stage.close();
    }

    public static class LoginController {

        @FXML
        private Button CancelButton;

        public LoginController(Button cancelButton) {
            CancelButton = cancelButton;
        }

        public void CancelButtonAction(ActionEvent event){
            Stage stage = (stage) CancelButton.getScene().getWindow();
            stage.close();
        }
    }
}