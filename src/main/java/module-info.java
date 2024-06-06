module com.example.mujprvniprojektnagitu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.stredniskola.smistik to javafx.fxml;
    exports com.stredniskola.smistik;
}