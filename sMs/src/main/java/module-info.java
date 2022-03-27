module com.example.sms {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sms to javafx.fxml;
    exports com.example.sms;
}