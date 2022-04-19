package com.example.sms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class LogInPageController{

    @FXML
    private Button btn_signIn;

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField tf_username;

    @FXML
    private Label wrongInput;

    @FXML
    public void signIn(ActionEvent event) throws IOException {

        Path path = Paths.get("C:/Users/Nahid Raz/Documents/Git/StudentManagementSystem/sMs/src/main/resources/Info/Login.txt");

        //Counts number of line in text file
        long count = Files.lines(path).count();

        /// read each line
        for (int i = 0; i < count; i++)
        {
            String line = Files.readAllLines(path).get(i);
            if(!line.trim().equals(""))
            {

                //According to format Name, Email, Password, Age, Gender
                String[] profile = line.split(",");

                String name = profile[0];
                String password = profile[1];

                //Email Matched!
                if(name.trim().equals(tf_username.getText())){ //Note trim() method remove space from front and behind of string if there is any
                    //Now checking if password match
                    if(password.trim().equals(password_field.getText())){

                        Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }
                }

                }
                }
            }
        }


