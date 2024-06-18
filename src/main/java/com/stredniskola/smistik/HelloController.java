package com.stredniskola.smistik;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class HelloController implements Initializable {
    @FXML
    private Polygon auto;
    @FXML
    private ColorPicker barva;
    @FXML
    private Circle predni;
    @FXML
    private Circle zadni;
    @FXML
    private Slider slider;


    boolean wracked = false;

    public void zmenBarvu(ActionEvent event) {
        auto.setFill(barva.getValue());
    }

    @java.lang.Override
    public void initialize(java.net.URL url, java.util.ResourceBundle resourceBundle) {
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
              predni.setRadius((Double) newValue);
              zadni.setRadius((Double) newValue);
            }
        });
    }
}