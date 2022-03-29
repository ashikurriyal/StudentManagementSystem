package com.example.sms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogInPageController {

    @FXML
    private Button btn_signIn;

    @FXML
    private TextField tf_username;

    @FXML
    void onclick_signIn(ActionEvent event) {
        FXMLScene fxmlScene = FXMLScene.load("Dashboard.fxml");
        Parent root = fxmlScene.root;
        DashboardController dashboardController = (DashboardController) fxmlScene.controller;
        Main.primaryStage.setScene(new Scene(root, 900, 700));
    }

}
