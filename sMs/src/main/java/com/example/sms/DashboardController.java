package com.example.sms;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class DashboardController {

    @FXML
    private Text txt_username;

    void set_username(String username){

        txt_username.setText(username);
    }

}
