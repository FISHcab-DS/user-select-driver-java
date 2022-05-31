package com.example.appgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.*;

public class TravelBeginsController implements Initializable {
    @FXML
    public Label request_name_label = new Label();
    @FXML
    public Label request_pul_label = new Label();
    @FXML
    public Label request_dl_label = new Label();
    @FXML
    public Label request_capacity_label = new Label();
    @FXML
    public Label request_eat_label = new Label();
    @FXML
    public Label request_price_label = new Label();
    @FXML
    public Label driver_name_label = new Label();
    @FXML
    public Label driver_rating_label = new Label();
    @FXML
    public Label driver_capacity_label = new Label();
    @FXML
    public Label driver_eat_label = new Label();
    @FXML
    public Label status_label = new Label();
    @FXML
    public Label min_label = new Label();
    @FXML
    public Button arrivedBtn = new Button();
    @FXML
    public final Stage reviewStage = new Stage();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        Request r = new Request();
        request_name_label.setText(r.getName());
        request_pul_label.setText(r.getPul());
        request_dl_label.setText(r.getDl());
        request_capacity_label.setText(String.valueOf(r.getCapacity()));
        request_eat_label.setText(r.getEat());
        request_price_label.setText("RM "+r.getPrice());
        driver_name_label.setText(SelectedDriver.name);
        driver_rating_label.setText(String.valueOf(SelectedDriver.rating));
        driver_capacity_label.setText(String.valueOf(SelectedDriver.capacity));
        driver_eat_label.setText(SelectedDriver.eat);
        status_label.setText("Waiting for driver");

        arrivedBtn.setDisable(true);

        int interval1 = 2;
        int interval2 = 4;
        min_label.setText(String.valueOf(interval1));

        Timer timer1 = new Timer();
        MyTimerTask wait_driver_to_arrive = new MyTimerTask(interval1, interval2, min_label, status_label, arrivedBtn);
        timer1.scheduleAtFixedRate(wait_driver_to_arrive, 1000, 1000);

    }

    public void arrived(ActionEvent event) throws Exception{
        System.out.println("Arrived");
        Review reviewPage = new Review();
        reviewPage.start(reviewStage);
//        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//        window.close();
    }

    public void cancel(ActionEvent event) throws Exception{
        System.out.println("cancel");
    }
}
