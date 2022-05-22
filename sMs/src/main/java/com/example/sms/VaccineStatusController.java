package com.example.sms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class VaccineStatusController implements Initializable  /*implements Initializable*/ {

    @FXML
    private ChoiceBox<String> choicebox1;

    @FXML
    private ChoiceBox<String> choicebox2;

    @FXML
    private Button update;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choicebox1.getItems().addAll("Astrazeneca", "Phizer", "Moderna" , "Johnson & Johnson");
        choicebox2.getItems().addAll("Astrazeneca", "Phizer", "Moderna" , "Johnson & Johnson");
    }
    @FXML
    private DatePicker datePicker1;

    @FXML
    private DatePicker datePicker2;

    @FXML
    void onClickUpdate(ActionEvent event) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append(choicebox1.getValue().toString() + "\n");
        String date1 = (datePicker1.getValue() + "\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(choicebox2.getValue().toString() + "\n");
        String date2 = (datePicker2.getValue() + "\n");


        File file = new File("C:/Users/Nahid Raz/Documents/Git/StudentManagementSystem/sMs/src/main/resources/Info/VaccineUpdate.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fw.write(sb1.toString());
            fw.write(date1.toString());
            fw.write(sb2.toString());
            fw.write(date2.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void switchToRegistration(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Registration.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void switchToLogInPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LogInPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void switchToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    void switchToSettings(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FAQ.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void switchToPayTheFess(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PayTheFess.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
