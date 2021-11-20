package com.example.undecoratedscene;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;

public class UIController {


    private double xOffset = 0, yOffset = 0;

    @FXML
    private Label welcomeText;

    @FXML
    private void open_settings(){}

    @FXML
    private void open_user_profile(){}

    public void onDragDone(DragEvent dragEvent) {
        HelloApplication.stage.setOpacity(1.0f);
    }

    public void onMouseDragged(MouseEvent mouseEvent) {
        HelloApplication.stage.setX(mouseEvent.getScreenX() - xOffset);
        HelloApplication.stage.setY(mouseEvent.getScreenY() - yOffset);
        HelloApplication.stage.setOpacity(0.8f);
    }

    public void onMouseExited(MouseEvent mouseEvent) {
    }

    public void onMousePressed(MouseEvent mouseEvent) {
        xOffset = mouseEvent.getSceneX();
        yOffset = mouseEvent.getSceneY();
    }

    public void onMouseReleased(MouseEvent mouseEvent) {
        HelloApplication.stage.setOpacity(1.0f);
    }
}