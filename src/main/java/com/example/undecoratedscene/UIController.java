package com.example.undecoratedscene;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UIController {


    private double xOffset = 0, yOffset = 0;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Pane pane;

    public void initialize(URL url, ResourceBundle rb){
//        makeStageDraggable();
//        anchorPane.setBackground(null);

    }

    @FXML
    private void open_settings() throws IOException {
        Parent menu  = FXMLLoader.load(getClass().getResource("SettingsUI.fxml"));
        pane.getChildren().removeAll();
        pane.getChildren().setAll(menu);
    }

    @FXML
    private void open_user_profile() throws IOException {
        Parent menu  = FXMLLoader.load(getClass().getResource("UserProfile.fxml"));
        pane.getChildren().removeAll();
        pane.getChildren().setAll(menu);
    }

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