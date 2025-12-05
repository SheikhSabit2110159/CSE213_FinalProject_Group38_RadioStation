module com.example.simulating_operations_of_a_fm_radio_station {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulating_operations_of_a_fm_radio_station to javafx.fxml;
    exports com.example.simulating_operations_of_a_fm_radio_station;
}